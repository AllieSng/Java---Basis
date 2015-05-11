package com.sourceit.java.basic.petrenko.ht8.workers;

public class ResumeCreator {

	public Worker createResume(int wId, String wName, String wSalaryType, int wSalary) {
		Worker worker = null;

		if (wSalaryType.equals("fixed")) {
			worker = new FixedSalaryWorker(wId, wName, wSalaryType, wSalary);
		} else if (wSalaryType.equals("hour")) {
			worker = new HourSalaryWorker(wId, wName, wSalaryType, wSalary);
		}
		worker.name = wName;

		return worker;

	}

}
