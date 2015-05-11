package com.sourceit.java.basic.petrenko.ht8.workers;

import java.util.Comparator;

public class WorkersSalaryComparator implements Comparator<Worker>{

	@Override
	public int compare(Worker worker1, Worker worker2) {
		int salaryComp = worker1.getMonSalary() - worker2.getMonSalary();
		if (salaryComp != 0){
			return salaryComp;
		} else{
			int nameComp = worker1.name.compareTo(worker2.name);
			return nameComp;
		}
	}
}
