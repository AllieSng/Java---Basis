package com.sourceit.java.basic.petrenko.ht18.wget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connector {

	public static boolean openUrlConnection(String enteredUrl) {
		URL url;
		InputStream is = null;
		try {
			url = new URL(enteredUrl);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("HEAD");
			int responseCode = connection.getResponseCode();
			if (responseCode == 200) {
				return true;
			} else {
				return false;
			}

		} catch (Exception ex) {
			System.out.println("Error: page is not available");
			return false;
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					return false;
				}
			}
		}
	}

}
