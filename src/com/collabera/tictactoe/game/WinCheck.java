package com.collabera.tictactoe.game;

public class WinCheck {

	public static boolean checkForWinner(String[] board) {
		boolean isWinner = false;
		for (int winCheck = 1; winCheck < 9; winCheck++) {
			String line = null;

			switch (winCheck) {

			case 1:
				line = board[1] + board[2] + board[3];
				break;
			case 2:
				line = board[4] + board[5] + board[6];
				break;
			case 3:
				line = board[7] + board[8] + board[9];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[3] + board[6] + board[9];
				break;
			case 7:
				line = board[1] + board[5] + board[9];
				break;
			case 8:
				line = board[3] + board[5] + board[7];
				break;
			}
			if ((line.equals("XXX")) || (line.equals("OOO"))) {
				isWinner = true;
			}
		}
		return isWinner;
	}
}