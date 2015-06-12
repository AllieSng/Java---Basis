package com.sourceit.java.basic.petrenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class MainLauncher {
	static LinkedHashSet<String> menu = new LinkedHashSet<String>();
	
	public static void menuCreation(){
		menu.add("Home task 2 : Language Basic(cell game)");
		menu.add("Home task 3 : Methods. Arrays(cell game)");
		menu.add("Home task 4 : Algorithms (sorting)");
		menu.add("Home task 6 : OOP (icecream)");
		menu.add("Home task 7 : Classes (arrays)");
		menu.add("Home task 10 : Strings, Numbers(bank)");
		menu.add("Home task 11 : Generics, Collections(textstatistics)");
		menu.add("Home task 13 : Compare, Sorting, hashCode(toys)");
		menu.add("Home task 15 : IO, Files, Enum, Instanceof(textstatistics)");
	}
	public static void main(String[] args) {
		String choise;
		System.out.println("HOME TASKS : ");
		menuCreation();
		for (String hometask: menu){
			System.out.println(hometask);
		}
		try {
			while(true) {
				System.out
						.println("*****\nEnter home task number.\nPress \'0' for exit");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				choise = br.readLine();
				switch (choise) {
				case "0": System.out.println("Programm has been finished");
					return;
				case "2":
					com.sourceit.java.basic.petrenko.ht1.labirinth.Launcher.main(args);
					break;
				case "3":
					com.sourceit.java.basic.petrenko.ht2.cellgame.Game.main(args);
					break;
				case "4":
					com.sourceit.java.basic.petrenko.ht3.sort.Sort.main(args);
					break;
				case "6":
					com.sourceit.java.basic.petrenko.ht6.icecreamfactory.launcher.Launcher.main(args);
					break;
				case "7":
					com.sourceit.java.basic.petrenko.pr7.arrays.Test.main(args);
					break;
				case "10":
					com.sourceit.java.basic.petrenko.ht10.bank.Launcher.main(args);
					break;
				case "11":
					com.sourceit.java.basic.petrenko.ht11.textstatistics.Launcher.main(args);
					break;
				case "13":
					com.sourceit.java.basic.petrenko.ht12.toys.Launcher12.main(args);
					break;
				case "15":
					com.sourceit.java.basic.petrenko.ht11.textstatistics.Launcher.main(args);
					break;
				default: System.out.println("Enter value for hometask!");
				}
			} 
		} catch (IOException e) {
			System.out.println("Programm failed. Please contact with administrators.");
		}

	}
}
