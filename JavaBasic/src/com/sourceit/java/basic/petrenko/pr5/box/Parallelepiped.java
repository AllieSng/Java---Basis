package com.sourceit.java.basic.petrenko.pr5.box;
import java.awt.Point;

public abstract class Parallelepiped {
	
	public int height;
	public int width;
	public int depth;
	
	public int volume(){
		return height * width * depth;
	}
		
	public abstract String info();
	
	public void setHeight(int h){
		height = h > 0 ? h : 0;
	}
	

}
