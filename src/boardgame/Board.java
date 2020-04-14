package boardgame;

public class Board {

	private int rows;
	private int colums;
	private Piece[][] pieces;//association with piece
	//creates matrix with pieces
	public Board(int rows, int colums) {
		this.rows = rows;
		this.colums = colums;
		pieces = new Piece[rows][colums];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColums() {
		return colums;
	}

	public void setColums(int colums) {
		this.colums = colums;
	}
	//returns matrix by row and column
	public Piece piece(int row, int colum) {
		return pieces[row][colum];
	}
	//returns matrix by position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColum()];
	}
}
