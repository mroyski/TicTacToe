package com.collabera.tictactoe.game;

public class PrintBoard {
	
	public static StringBuilder row1 = new StringBuilder("1 | 2 | 3");
	public static StringBuilder row2 = new StringBuilder("4 | 5 | 6");
	public static StringBuilder row3 = new StringBuilder("7 | 8 | 9");
	public static String rowBreak = ("---------");
	
	public static void print() {
		System.out.println(row1);
		System.out.println(rowBreak);
		System.out.println(row2);
		System.out.println(rowBreak);
		System.out.println(row3);
	}
	
	public static void printWinner(String turn) {
		System.out.println(turn + " has won the game!");
	}
	
}
