package com.sourceit.java.basic.petrenko.pr5.box;

public abstract class Box extends Parallelepiped implements Movable, Location{

	//параметризированный конструктор
	public Box(int h, int w, int d) {
		height = h > 0 ? h : 0;
		width = w > 0 ? w : 0;
		depth = d > 0 ? d : 0;
	}

	public Box() {

	}

	public String info() {
		return "a Box";

	}

	@Override
	public int volume() {
		// TODO Auto-generated method stub
		return super.volume();
	}
}

// if (h >0){
// height = h;
// } else height = 0;
//	