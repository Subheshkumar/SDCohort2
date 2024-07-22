package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategy.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
	private BotDifficultyLevel botDifficultyLevel;
	private BotPlayingStrategy botPlayingStrategy;
	
	public Bot(BotDifficultyLevel botDifficultyLevel,String name,Symbol symbol,Long id) {
		super(name, symbol, id, PlayerType.BOT);
		this.botDifficultyLevel = botDifficultyLevel;
		this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyBasedOnDifficulty(botDifficultyLevel);
	}
	

	public Move makeMove(Board board) {
		Move move = botPlayingStrategy.makeMove(board);
		move.setPlayer(this);
		return move;
	}

	public BotDifficultyLevel getBotDifficultyLevel() {
		return botDifficultyLevel;
	}

	public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
		this.botDifficultyLevel = botDifficultyLevel;
	}
}
