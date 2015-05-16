package com.sourceit.java.basic.petrenko.ht11;

public class Launcher {
	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		TestStImplementation ti = new TestStImplementation(text);
		System.out.println(ti.getCharFrequency('o'));
		System.out.println(ti.getCharCount('o'));
		System.out.println(ti.words());
		System.out.println(ti.getChars());
		System.out.println(ti.getMostPopularCharCount());
		System.out.println(ti.getLeastPopularCharCount());
		System.out.println(ti.getCharByCount(1));
		}
}
