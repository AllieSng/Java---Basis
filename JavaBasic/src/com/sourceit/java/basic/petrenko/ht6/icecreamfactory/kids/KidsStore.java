package com.sourceit.java.basic.petrenko.ht6.icecreamfactory.kids;

public class KidsStore {

	KidsFactory factory;

	public KidsStore(KidsFactory factory) {
		this.factory = factory;
	}

	public Kids createKid(String name) {
		Kids kid;
		kid = factory.bornKid(name);
		return kid;
	}

}
