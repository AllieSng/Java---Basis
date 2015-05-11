package com.sourceit.java.basic.petrenko.ht8.workers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Launcher {

	public static ArrayList<Worker> workersList;

	public static void createTestData() {
		ResumeCreator resume = new ResumeCreator();
		ExchangePlace exchenger = new ExchangePlace(resume);

		ArrayList<Worker> workers = new ArrayList<Worker>();
		workers.add(exchenger.hireWorker(1, "Ivan", "fixed", 876));
		workers.add(exchenger.hireWorker(2, "Arthur", "fixed", 573));
		workers.add(exchenger.hireWorker(3, "Petr", "fixed", 487));
		workers.add(exchenger.hireWorker(4, "Daria", "hour", 10));
		workers.add(exchenger.hireWorker(5, "Maria", "fixed", 5587));
		workers.add(exchenger.hireWorker(6, "Katya", "hour", 1187));
		workers.add(exchenger.hireWorker(7, "Valik", "hour", 1187));
		workers.add(exchenger.hireWorker(8, "Denis", "hour", 5432));
		workers.add(exchenger.hireWorker(9, "Kolya", "fixed", 873));
		workersList = workers;
	}

	public static void Sort(ArrayList<Worker> workers) {
		WorkersSalaryComparator salaryComparator = new WorkersSalaryComparator();
		// Collections.sort(workers, salaryComparator); //ascending
		Collections.sort(workers, Collections.reverseOrder(salaryComparator));
		System.out.println("All workers: \n" + workers);

		System.out.println("Winners :");
		for (int i = 0; i <= 4; i++) {
			System.out.print(workers.get(i));
		}

		System.out.println();
		System.out.println("Loosers :");
		for (int i = workers.size() - 1; i > workers.size() - 4; i--) {
			System.out.println("\t ID: " + workers.get(i).id);
		}
	}

	public static void main(String[] args) {
		createTestData();
		Sort(workersList);
	}
}
