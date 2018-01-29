package com.practice.tic.tac.toe.game.manager;

import com.practice.tic.tac.toe.player.Player;

public class GameManager extends Player {

	Player player = new Player();
	TicTacToeBoard board = new TicTacToeBoard();
	public boolean win = false;
	
	public void startGame() {
		player.initGame();
		do{
			player.getPlayer1Input();
			isDraw(matrix);
			if(isDraw(matrix) == true){
				break;
			}
			player.getPlayer2Input();
     		if(isDraw(matrix) == true){
				break;
			}
		}while(board.isWon() == win);

		/*
		 * player.getPlayer1Input(); player.getPlayer2Input();
		 * player.getPlayer1Input(); player.getPlayer2Input();
		 * player.getPlayer1Input(); player.getPlayer2Input();
		 * player.getPlayer1Input();
		 */
	}

	private boolean isDraw(String[][] matrix) {
		/*for (int row = 0; row < 3; ++row) {
	         for (int col = 0; col < 3; ++col) {*/
	            if(matrix.equals("-")){
	            	return true;
	            }
	      /*   }
	      }*/	
		/*if (matrix.) {
				System.out.println("game is draw.");
				return true;
			}else{
				System.out.println("continue");
				return false;
			}*/
		return false;
		}

	public void finishGame() {
		if (board.isWon() != win) {
			System.out.println("game over");
			System.out.println("=================");
		}
	}

}
