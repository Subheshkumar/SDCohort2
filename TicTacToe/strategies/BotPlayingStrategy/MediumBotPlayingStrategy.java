package TicTacToe.strategies.BotPlayingStrategy;

import java.util.List;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Move;

public class MediumBotPlayingStrategy implements BotPlayingStrategy {

	@Override
	public Move makeMove(Board board) {
		for (List<Cell> row : board.getBoard()) {
			for (Cell cell : row) {
				if (cell.getPlayer() == null) {
					return new Move(cell, null);
				}
			}
		}
		return null;
	}

}
