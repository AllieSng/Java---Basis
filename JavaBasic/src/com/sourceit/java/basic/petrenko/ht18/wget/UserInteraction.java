package com.sourceit.java.basic.petrenko.ht18.wget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInteraction {

	public static final String[] COMMANDS = { "Save page", "Display title",
			"Find a word", "List all URL's on the page" };

	public static String enteredUrl;
	public static boolean urlCheckFlag;

	public static String printInfo() {
		return "*****\nProgramm allows working with a web page content.\n"
				+ "Usage: enter web address\n"
				+ "       enter -i for information\n"
				+ "       enter \'0' for exit\n"
				+ "Example: http://google.com\n******";
	}

	private static String printInstructions() {
		return "Usage: enter web address in format http://site.com or enter \'0' for exit\n";
	}

	public static boolean askForUrlInput(String[] args) {
		// ** Check whether command line params is available **
		if (args.length == 0) {
			System.out.println("Enter URL:");
			enteredUrl = readChoise();

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

	public static String readChoise() {
		String choise = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			choise = br.readLine();

		} catch (IOException e) {
			System.out
					.println("Programm failed. Please contact with administrators.");
		}
		return choise;
	}

	public static void printAllCommands() {
		System.out.println("Select what to do next:");
		for (int i = 0; i < COMMANDS.length; i++) {
			System.out.println((i + 1) + ") " + COMMANDS[i]);
		}

	}

	public static void executeCommand(int choise) {
		switch (choise) {
		case 1:
			WGetHepler.savePage(UserInteraction.enteredUrl);
			break;
		case 2:
			WGetHepler.displayTitle();
			break;
		case 3:
			WGetHepler.findWord();
			break;
		case 4:
			WGetHepler.listAllUrls();
			break;
		default:
			break;
		}
	}

}
