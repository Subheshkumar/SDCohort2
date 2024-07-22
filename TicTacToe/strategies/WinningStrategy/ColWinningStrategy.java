package TicTacToe.strategies.WinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public class ColWinningStrategy implements WinningStrategy{

	@Override
	public boolean checkWinner(Board board, Move move) {
		return false;
	}

}
