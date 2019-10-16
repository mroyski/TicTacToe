package com.collabera.tictactoe.game;

import java.util.Scanner;

public class GameBoard2 {

	public static void main(String[] args) {

		String[] board = new String[10];
		boolean winner = false;
		String turn = "X";
		int turnsTaken = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to tic tac toe!");
		System.out.println("Select a square by using numbers 1 - 9.");
		PrintBoard.print();

		while (winner == false) {
			if (turnsTaken == 9) {
				System.out.println("No winner this round.");
				break;
			}

			if (turnsTaken % 2 == 0) {
				turn = "X";
			} else {
				turn = "O";
			}

			System.out.println("It is " + turn + "'s turn...");

			Integer input = sc.nextInt();
			sc.nextLine();

			if ((input < 10) && (board[input] == null)) {

				switch (input) {
				case 1:
					board[1] = turn;
					PrintBoard.row1.setCharAt(0, turn.charAt(0));
					break;
				case 2:
					board[2] = turn;
					PrintBoard.row1.setCharAt(4, turn.charAt(0));
					break;
				case 3:
					board[3] = turn;
					PrintBoard.row1.setCharAt(8, turn.charAt(0));
					break;
				case 4:
					board[4] = turn;
					PrintBoard.row2.setCharAt(0, turn.charAt(0));
					break;
				case 5:
					board[5] = turn;
					PrintBoard.row2.setCharAt(4, turn.charAt(0));
					break;
				case 6:
					board[6] = turn;
					PrintBoard.row2.setCharAt(8, turn.charAt(0));
					break;
				case 7:
					board[7] = turn;
					PrintBoard.row3.setCharAt(0, turn.charAt(0));
					break;
				case 8:
					board[8] = turn;
					PrintBoard.row3.setCharAt(4, turn.charAt(0));
					break;
				case 9:
					board[9] = turn;
					PrintBoard.row3.setCharAt(8, turn.charAt(0));
					break;
				}

				PrintBoard.print();
				turnsTaken++;

			} else {
				System.out.println("Invalid entry. Please try again.");
				PrintBoard.print();
			}

//			for (int winCheck = 1; winCheck < 9; winCheck++) {
//				String line = null;
//
//				switch (winCheck) {
//
//				case 1:
//					line = board[1] + board[2] + board[3];
//					break;
//				case 2:
//					line = board[4] + board[5] + board[6];
//					break;
//				case 3:
//					line = board[7] + board[8] + board[9];
//					break;
//				case 4:
//					line = board[1] + board[4] + board[7];
//					break;
//				case 5:
//					line = board[2] + board[5] + board[8];
//					break;
//				case 6:
//					line = board[3] + board[6] + board[9];
//					break;
//				case 7:
//					line = board[1] + board[5] + board[9];
//					break;
//				case 8:
//					line = board[3] + board[5] + board[7];
//					break;
//				}
//				if ((line.equals("XXX")) || (line.equals("OOO"))) {
//					PrintBoard.printWinner(turn);
//					winner = true;
//				}
//
//			}

			if (WinCheck.checkForWinner(board)) {
				PrintBoard.printWinner(turn);
				winner = true;
			}

		}
		sc.close();

	}
}