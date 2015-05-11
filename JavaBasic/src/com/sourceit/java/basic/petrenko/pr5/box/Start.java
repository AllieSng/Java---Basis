package com.sourceit.java.basic.petrenko.pr5.box;

import java.awt.Point;

public class Start {

	public static void main(String[] args) {
		double vol;
		ColorBox myBox = new ColorBox(10, 44, 13, "red");
		vol = myBox.volume();
		System.out.println("Volume of first box = " + vol);
		//System.out.println(myBox);
		
		Transport t = new Transport();
		t.send(myBox);
		
		HeavyBox myBox2 = new HeavyBox();
		myBox2.printHeight();
		myBox2.setHeight(10);
		
		Scyscrapper s = new Scyscrapper();
		s.getPosition();
		
		Fridge f = new Fridge();
		f.move(2, 3);
		
		Box b = new HeavyBox();
		b.getPosition();
		//тут нет printHeight()б тк он описан в последователе Box
		
		HeavyBox p = new HeavyBox();
		p.printHeight();
	}

}
