package chess;

import boardgame.Position;

public class ChessPosition {

	private int row;
	private char column;
	
	public ChessPosition(char column, int row) {
		if((row < 1 || row > 8) || (column < 'a' || column > 'h')) {
			throw new ChessException("Error instatiating ChessPosition. Valid value are from a1 to h8.");
		}
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}

	protected Position toPosisition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColum()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
