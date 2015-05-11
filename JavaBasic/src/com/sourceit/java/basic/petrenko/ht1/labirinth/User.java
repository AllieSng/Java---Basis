package com.sourceit.java.basic.petrenko.ht1.labirinth;

import java.util.ArrayList;

public class User {

	protected Path pathToExit;
	protected ArrayList<Path> pathesToFail;

	public void goForward(){
		//finding the path by looking on successful and unsuccessful ways
		pathToExit.checkPath();
		for (Path path : pathesToFail) {
			path.checkPath();
			path.updatePath();
		}
	}
	
	public void goBack(){
		
	}
	
	public void goRight(){
		
	}
	
	public void goLeft(){
		
	}
	
}
