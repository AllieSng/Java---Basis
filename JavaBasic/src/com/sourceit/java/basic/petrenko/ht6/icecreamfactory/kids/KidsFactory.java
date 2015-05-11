package com.sourceit.java.basic.petrenko.ht6.icecreamfactory.kids;

public class KidsFactory {
	
	public Kids bornKid(String name){
		Kids kid = null;
		
		if (name.equals("Vanya")){
			kid = new Vanya();
		} else if(name.equals("Masha")){
			kid = new Masha();
		} else if(name.equals("Asya")){
			kid = new Asya();
		} else if (name.equals("Petya")){
			kid = new Petya();
		}
		return kid;
	}
	

}
