package com.CoreJavaConcepts;

public class Sudoku {
	
	// we define a simple grid to solve. Grid is stored in a 2D Array
	public static int[][] GRID_TO_SOLVE = {
			{9,0,0,1,0,0,0,0,5},
			{0,0,5,0,9,0,2,0,1},
			{8,0,0,0,4,0,0,0,0},
			{0,0,0,0,8,0,0,0,0},
			{0,0,0,7,0,0,0,0,0},
			{0,0,0,0,2,6,0,0,9},
			{2,0,0,3,0,0,0,0,6},
			{0,0,0,2,0,0,9,0,0},
			{0,0,1,9,0,4,5,7,0},
	};
	
	private int[][] board;
	public static final int EMPTY = 0; // empty cell
	public static final int SIZE = 9; // size of our Sudoku grids
	
	public Sudoku(int[][] board) {
		this.board = new int[SIZE][SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				this.board[i][j] = board[i][j];
			}
		}
	}
  
  // ...
}