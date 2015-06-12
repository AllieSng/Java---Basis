package com.sourceit.java.basic.petrenko.ht18.wget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WGetAdditionalTest {

	public static final String[] COMMANDS = { "Save page", "Display title",
			"Find a word", "List all URL's on the page" };

	static String enteredUrl;
	static boolean urlCheckFlag;

	public static void main(String[] args) {
		System.out.println(printInfo());
		askForUrlInput(args);
		if (urlCheckFlag == true) {
			printAllCommands();
			// executeCommand();
		}
	}

	private static String printInfo() {
		return "*****\nProgramm allows working with a web page content.\n"
				+ "Usage: enter web address\n"
				+ "       enter -i for information\n"
				+ "       enter \'0' for exit\n"
				+ "Example: http://google.com\n******";
	}

	private static String printInstructions() {
		return "Usage: enter web address in format http://site.com or enter \'0' for exit\n";
	}

	private static boolean askForUrlInput(String[] args) {
		// ** Check whether command line params is available **
		if (args.length == 0) {
			enteredUrl = readEnteredUrl();

			// ** Ask for URL if there is no command line params **
		} else {
			enteredUrl = args[0];

		} // ** Validation **
		boolean check = validateUrl();
		if (check == true) {
			urlCheckFlag = true;
		} else {
			askForUrlInput(args);
		}
		return urlCheckFlag;
	}

	private static boolean validateUrl() {
		boolean flag = false;
		if ("-i".equals(enteredUrl)) {
			System.out.println(printInstructions());
			flag = false;

		} else if (enteredUrl.startsWith("http")) {
			flag = true;

		} else if (!enteredUrl.startsWith("http")) {
			// TODO: http-ignore
			System.out.println(printInstructions());
			flag = false;

		} else if ("0".equals(enteredUrl)) {
			System.out.println("Exit");
			// TODO
			flag = false;
		}
		return flag;
	}

	private static String readEnteredUrl() {
		String choise = null;
		try {
			System.out.println("Enter URL:");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			choise = br.readLine();

		} catch (IOException e) {
			System.out
					.println("Programm failed. Please contact with administrators.");
		}
		return choise;
	}

	private static void printAllCommands() {
		System.out.println("Select what to do next:");
		for (int i = 0; i < COMMANDS.length; i++) {
			System.out.println((i + 1) + ") " + COMMANDS[i]);
		}

	}

	private static void executeCommand(int commandNumber) {
		switch (commandNumber) {
		case 1:
			// TODO
			break;

		default:
			break;
		}
	}

}
