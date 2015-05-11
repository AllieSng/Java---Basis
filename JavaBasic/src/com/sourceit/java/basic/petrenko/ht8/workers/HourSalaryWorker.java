package com.sourceit.java.basic.petrenko.ht8.workers;

public class HourSalaryWorker extends Worker {

	private int monSalary;

	public HourSalaryWorker(int id, String workerName, String wSalaryType,
			int hourSalary) {
		this.id = id;
		this.name = workerName;
		this.salaryType = wSalaryType;
		calculateSalary(hourSalary);
	}

	@Override
	public int calculateSalary(int hourSalary) {
		monSalary = 20 * 8 * hourSalary;
		return monSalary;
	}

	@Override
	public void print() {
		System.out.println(name + " " + salaryType + " " + monSalary);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMonSalary() {
		return monSalary;
	}

	public String toString() {
		return "\n" + "\t ID: " + id + "\t Name: " + name + "\t Earns: "
				+ monSalary;
	}
}
