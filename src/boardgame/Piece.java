package boardgame;

public abstract class Piece {

	protected Position position;//Protecting because it's not a chess position is just a simple matrix
	private Board board;//association with board
	
	//Creates a piece and inform board, the first position is null
	public Piece(Board board) {
		this.board = board;
		position = null;//Redundancy
	}

	//Not accessible by the chess layer
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position){
		return possibleMoves()[position.getRow()][position.getColum()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
