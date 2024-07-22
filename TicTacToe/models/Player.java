package TicTacToe.models;

import java.util.Scanner;

public class Player {
	private String name;
	private Symbol symbol;
	private Long id;
	private PlayerType playerType;
	private Scanner scanner;
	
	public Player(String name,Symbol symbol,Long id, PlayerType type) {
		this.name = name;
		this.symbol = symbol;
		this.id = id;
		this.playerType = type;
		this.scanner = new Scanner(System.in);
	}
	
	public Move makeMove(Board board) {
		System.out.println("Please tell row no you want to move(0 based index)");
		int row = scanner.nextInt();
		System.out.println("Please tell col no you want to move(0 based index)");
		int col = scanner.nextInt();
		
		Move move = new Move(new Cell(row,col),this);
		return move;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PlayerType getPlayerType() {
		return playerType;
	}
	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}
	
}
