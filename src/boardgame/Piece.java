package boardgame;

public class Piece {

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

}
