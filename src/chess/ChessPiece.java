package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{ // só por enquanto

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
}
