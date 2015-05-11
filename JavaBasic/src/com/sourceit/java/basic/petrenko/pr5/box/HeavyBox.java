package com.sourceit.java.basic.petrenko.pr5.box;

import java.awt.Point;

public class HeavyBox extends Box{

	public int weight;
	

	public String info(){
		return "a heavy box";
	}
	
	public void printHeight(){
		System.out.println(weight);
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
