package TicTacToe;

import java.util.ArrayList;
import java.util.List;

import TicTacToe.controllers.GameController;
import TicTacToe.exceptions.MoreThanOneBotException;
import TicTacToe.models.Bot;
import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerType;
import TicTacToe.models.Symbol;
import TicTacToe.strategies.WinningStrategy.WinningStrategy;

public class client {
	public static void main(String[] args) {
		GameController gameController = new GameController();
		try {

			int dimensionOfGame = 2;
			List<Player> players = new ArrayList<>();
			players.add(new Player("Subhesh", new Symbol('O'), 1L, PlayerType.HUMAN));
			players.add(new Bot(BotDifficultyLevel.EASY, "Subhu", new Symbol('X'), 2L));

			List<WinningStrategy> winningStrategies = new ArrayList<>();

			Game game = gameController.StartGame(dimensionOfGame, players, winningStrategies);
			System.out.println("Game has been created "+game.getBoard());
			
			while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
				// 1. PrintBoard
				// 2. X's turn
				// 3. ask to make move
				gameController.PrintBoard(game);
				
				gameController.MakeMove(game);
				System.out.println(gameController.checkState(game));
				
				
			}
		} catch (MoreThanOneBotException e) {
			System.out.println("Something went wrong");
		}

	}
}

// StartGame()
// makeMove()
// displayBoard()
// undo()
// checkState()
// getWinner()
