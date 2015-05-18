package com.sourceit.java.basic.petrenko.ht12.toys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class Company<winner> {

	public String name;
	Employee[] employees;

	public Company(String name, Employee[] employees) {
		this.name = name;
		this.employees = employees;
	}

	public Employee giveAFreeToy(Employee employees[]) {
		// ArrayList is used because we need to add unexpected quantity of employees, 
		// First and Last names can be duplicated
		// Optional we can use Hash Set as we have ID for employee (it's optimized for Quick Search)

		ArrayList<Employee> hashSet = new ArrayList<Employee>(Arrays.asList(employees));

		Employee winner = null;
		int rand = new Random().nextInt(hashSet.size());
		int i = 0;
		for (Employee emp : hashSet) {
			if (i == rand)
				winner = emp;
			i = i + 1;
		}
		System.out.println("Winner: " + winner);
		return winner;

	}

	public HashSet<String> nameNewProduct(Employee employees[]) {
		// Hash set is used because First name can't be duplicated

		String firstNames[] = new String[100];
		for (int i = 0; i < employees.length; i++) {
			firstNames[i] = employees[i].getFirstName();
		}

		HashSet<String> hashSet = new HashSet<String>(Arrays.asList(firstNames));
		System.out.println("Unic names: " + hashSet);
		return null;
	}

	public Map<String, Integer> choosePopularName(Employee employees[]) {
		// Map is used for saving Names and their quantity
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String firstNames[] = new String[100];
		for (int i = 0; i < employees.length; i++) {
			firstNames[i] = employees[i].getFirstName();
			if (!map.containsKey(firstNames[i])) {
				map.put(firstNames[i], 1);
			} else {
				map.put(firstNames[i], map.get(firstNames[i]) + 1);
			}
		}
		// TODO: ValueComparator is needed
		System.out.println("Popular names: " + map);
		return map;
	}

	public Deque<Employee> acquireTicketsForLacrosse(Employee employees[]) {
		// Linked List implements Deque for insertion and removal at both ends
		
		Deque<Employee> deque = new LinkedList<Employee>(Arrays.asList(employees));
		System.out.println("Waiting list: "+ deque);
		return deque;
	}
}
