package com.sourceit.java.basic.petrenko.pr5.box;

import java.awt.Point;

public class ColorBox extends Box{
	public String color = "red";
	
	public ColorBox(int h, int w, int d, String c) {
//		height = h > 0 ? h : 0;
//		width = w > 0 ? w : 0;
//		depth = d > 0 ? d : 0;
		super(h, w, d);
		color = c;
	}
	
	public void printColor(){
		System.out.println(super.info());
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}
