package boardgame;

public class Board {

	private int rows;
	private int colums;
	private Piece[][] pieces;//association with piece
	//creates matrix with pieces
	public Board(int rows, int colums) {
		if(rows < 1 && colums < 1) {
			throw new BoardException("Error creating board: there must to be at a least 1 row and 1 colum ");
		}
		this.rows = rows;
		this.colums = colums;
		pieces = new Piece[rows][colums];
	}

	public int getRows() {
		return rows;
	}

	public int getColums() {
		return colums;
	}

	//returns matrix by row and column
	public Piece piece(int row, int colum) {
		if(!positionExist(row, colum)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][colum];
	}
	//returns matrix by position
	public Piece piece(Position position) {
		if(!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColum()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;
	}
	
	private boolean positionExist(int row, int colum) {
		return (row >= 0 && row < rows) && (colum >= 0 && colum < colums);
	}
	
	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getColum());
	}
	
	public boolean thereIsPiece(Position position) {
		if(!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
