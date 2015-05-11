package com.sourceit.java.basic.petrenko.ht6.icecreamfactory.kids;

import com.sourceit.java.basic.petrenko.ht6.icecreamfactory.icecream.Icecream;

public abstract class Kids implements Eatable{
	
	String name;
	String action;
	
	@Override
	public void eat(Icecream icecream) {
		System.out.print(name + " " + action +  " ");
		icecream.printTaste();
		
	}
}
