package com.sourceit.java.basic.petrenko.ht2.cellgame;

import java.util.HashMap;
import java.util.Random;

public class Cell {
	HashMap cellMap = new HashMap<String, Boolean>();
	int coordinateX;
	int coordinateY;
	
	Cell(int x, int y){
		coordinateX = x;
		coordinateY = y;
	}

	public void setCellValues(boolean leftVal, boolean rigntVal, boolean topVal, boolean bottomVal) {
		cellMap.put("left", leftVal);
		cellMap.put("right", rigntVal);
		cellMap.put("top", topVal);
		cellMap.put("bottom", bottomVal);
	}

}


