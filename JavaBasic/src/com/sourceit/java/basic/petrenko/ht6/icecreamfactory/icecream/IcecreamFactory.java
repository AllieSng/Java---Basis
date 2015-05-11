package com.sourceit.java.basic.petrenko.ht6.icecreamfactory.icecream;

public class IcecreamFactory {
	
	public Icecream createIcecream(String type){
		
		Icecream icecream = null;
		
		if(type.equals("Chocolate ice cream on a stick")){
			icecream = new Chocolate();
		} else if (type.equals("Dairy ice cream")){
			icecream = new Dairy();
		} else if (type.equals("Vanilla cone")){
			icecream = new Vanilla();
		}
		return icecream;
	}

}
