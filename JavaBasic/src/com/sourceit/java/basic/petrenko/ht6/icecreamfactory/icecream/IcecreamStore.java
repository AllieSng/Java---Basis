package com.sourceit.java.basic.petrenko.ht6.icecreamfactory.icecream;

public class IcecreamStore {

	IcecreamFactory factory; // transfer a reference on factory

	public IcecreamStore(IcecreamFactory factory) {
		this.factory = factory;
	}

	public Icecream orderIcecream(String type) {
		Icecream icecream;
		icecream = factory.createIcecream(type);
		
		return icecream;

	}
	
	
}
