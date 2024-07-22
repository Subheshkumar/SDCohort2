package TicTacToe.strategies.BotPlayingStrategy;

import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
	
	public static BotPlayingStrategy getBotPlayingStrategyBasedOnDifficulty(BotDifficultyLevel level) {
		if(level.equals(BotDifficultyLevel.EASY)) {
			return new EasyBotPlayingStrategy();
		}else if(level.equals(BotDifficultyLevel.MEDIUM)){
			return new MediumBotPlayingStrategy();
		}
		
		return null;
	}

}
