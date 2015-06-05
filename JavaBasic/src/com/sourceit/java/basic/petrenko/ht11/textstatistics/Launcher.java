package com.sourceit.java.basic.petrenko.ht11.textstatistics;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException {
		Helper.readFile(args);
		Helper.calculateStatistics();
		Helper.writeFile(args);
	}

}
