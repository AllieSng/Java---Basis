package com.sourceit.java.basic.petrenko.ht18.wget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher18 {

	public static void main(String[] args) {

		System.out.println(UserInteraction.printInfo());
		UserInteraction.askForUrlInput(args);

		if (UserInteraction.urlCheckFlag == true) {
			if (Connector.openUrlConnection(UserInteraction.enteredUrl) == true) {
				UserInteraction.printAllCommands();
				int choise = Integer.parseInt(UserInteraction.readChoise());
				UserInteraction.executeCommand(choise);
			} else
				UserInteraction.askForUrlInput(args);
		}
	}
}
