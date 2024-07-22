package TicTacToe.controllers;

import java.util.List;

import TicTacToe.exceptions.MoreThanOneBotException;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy.WinningStrategy;

public class GameController {
	public Game StartGame(int dimesionOfBoard,List<Player> players,
			List<WinningStrategy> winningStrategies) throws MoreThanOneBotException {

			return Game.getBuilder()
				.setPlayers(players)
				.setWinningStrategies(winningStrategies)
				.setDimension(dimesionOfBoard)
				.build();
		
	}
	
	public void MakeMove(Game game) {
		game.makeMove(game);
	}
	
	
	public void Undo(Game game) {
		
	}
	
	public void PrintBoard(Game game) {
		game.printBoard();
	}
	
	public GameState checkState(Game game) {
		return game.getGameState();
	}
	
	public void getWinner(Game game) {
		
	}
}
