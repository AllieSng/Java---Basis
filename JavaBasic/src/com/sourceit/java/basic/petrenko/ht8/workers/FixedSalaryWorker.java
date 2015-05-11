package com.sourceit.java.basic.petrenko.ht8.workers;

public class FixedSalaryWorker extends Worker {

	private int monSalary;

	public FixedSalaryWorker(int id, String workerName, String wSalaryType,
			int monSalary) {
		this.id = id;
		this.name = workerName;
		this.salaryType = wSalaryType;
		this.monSalary = monSalary;
	}

	@Override
	public int calculateSalary(int salary) {
		monSalary = salary;
		return monSalary;
	}

	@Override
	public void print() {
		System.out.println(name + " " + salaryType + " " + monSalary);
	}

	@Override
	public int getMonSalary() {
		return monSalary;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return "\n" + "\t ID: " + id + "\t Name: " + name + "\t Earns: "
				+ monSalary;
	}
}
