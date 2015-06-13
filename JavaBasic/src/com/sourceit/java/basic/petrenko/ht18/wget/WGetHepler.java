package com.sourceit.java.basic.petrenko.ht18.wget;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class WGetHepler {
	public static URL url;
	public static ArrayList<String> pageContent = new ArrayList<String>();

	public static void savePage(String enteredUrl) {
		InputStream is = null;
		BufferedReader br;
		String line;
		File file = new File("page.txt");

		try {
			url = new URL(enteredUrl);
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"outputfile.txt"));

			while ((line = br.readLine()) != null) {
				pageContent.add(line);
				if (!file.exists()) {
	                file.createNewFile();
	            }
				writer.write(line);
			} System.out.println("Page has been saved.");
		} catch (Exception ex) {
			System.out.println("Smth. wrong" + ex);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void displayTitle() {
		// TODO - working with 'pageContent' list
	}

	public static void findWord() {
		// TODO
	}

	public static void listAllUrls() {
		// TODO
	}

}
