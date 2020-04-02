package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves(){
		// TODO Auto-generated method stub
		//todas posicoes começam com falso
		boolean[][]mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
