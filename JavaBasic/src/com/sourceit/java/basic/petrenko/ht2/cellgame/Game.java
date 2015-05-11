package com.sourceit.java.basic.petrenko.ht2.cellgame;

import java.util.Random;

/**
 * @Author Alina Petrenko
 */

public class Game {

	private static Random rnd = new Random();

	public static void main(String[] args) {
		getMaze();
	}
	
	public static Cell[][] getMaze() {
		Cell cellArray[][] = new Cell[10][10];
		int i, j = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				boolean leftVal = rnd.nextBoolean();
				boolean rigntVal = rnd.nextBoolean();
				boolean topVal = rnd.nextBoolean();
				boolean bottomVal = rnd.nextBoolean();
				cellArray[i][j].setCellValues(leftVal, rigntVal, topVal, bottomVal);
			}
		}
		return cellArray;
	}
}
