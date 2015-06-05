package com.sourceit.java.basic.petrenko.ht11.textstatistics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Helper {
	
	static StringBuffer text;
	static StringBuffer statistics;
	static BufferedReader in = null;
	static PrintWriter out = null;
	
	static void readFile(String[] args) throws IOException {
		try {
			in = new BufferedReader(new FileReader(args[0]));
			text = new StringBuffer();
			String s;
			while ((s = in.readLine()) != null) {
				text.append(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Original file not found");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Specify original file name in \'.txt\' format");
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
	
	static void writeFile(String[] args) throws IOException {
		try {
			out = new PrintWriter(new FileWriter(args[1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Specify featured file name in \'.txt\' format");
		}
		try {
			out.println("TEXT STATISTICS: \n" + statistics.toString());
			out.println("TEXT: \n" + text.toString());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
	
	static void calculateStatistics() {
		TestStImplementation ti = new TestStImplementation(text.toString());
		statistics = new StringBuffer();
		statistics.append("Frequency of appearing a specified symbol : " + ti.getCharFrequency('f') + "\n");
		statistics.append("The number of specified characters in text : " + ti.getCharCount('f') + "\n");
		statistics.append("List of words in a text : " + ti.words() + "\n");
		statistics.append("Unique characters and it's counts : " + ti.getChars() + "\n");
		statistics.append("Most popular symbol quantity : " + ti.getMostPopularCharCount() + "\n");
		statistics.append("Least popular symbol quantity : " + ti.getLeastPopularCharCount() + "\n");
		statistics.append("This symbol appears specified number of times : " + ti.getCharByCount(1) + "\n");
	}
}
