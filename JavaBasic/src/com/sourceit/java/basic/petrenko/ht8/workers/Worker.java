package com.sourceit.java.basic.petrenko.ht8.workers;

public abstract class Worker implements Comparable {
	public int id;
	public String name;
	public String salaryType;

	public abstract void print();

	public abstract int calculateSalary(int salary);

	public abstract int getMonSalary();

}
