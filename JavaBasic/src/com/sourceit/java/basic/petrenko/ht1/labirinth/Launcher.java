package com.sourceit.java.basic.petrenko.ht1.labirinth;


import java.util.ArrayList;

public class Launcher {
	
	public void startGame(){
		//Press 'Enter' to start
	}
	
	public void generateLabirint(){
		//Creation of one successful way
		Path successPath = new Path();
		successPath.generatePath();
		
		//Creation of 5 unsuccessful ways	
		ArrayList<Path> fakePathes = new ArrayList<Path>();
		for (int i=1; i<5;i++) {
			Path fakePath = new Path();
			fakePath.generatePath();
			fakePathes.add(fakePath);
		}
		//Creation of new user with ways
		User userName = new User();
		userName.pathToExit = successPath;
		userName.pathesToFail = fakePathes;
	}
	
	public void Exit(){
		//Press some button for exit
	}

	public static void main(String[] args) {
		Launcher labirint = new Launcher();
		labirint.startGame();
		labirint.generateLabirint();
	}
}
