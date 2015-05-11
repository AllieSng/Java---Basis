package com.sourceit.java.basic.petrenko.ht8.workers;

public class ExchangePlace {

	ResumeCreator creator;

	public ExchangePlace(ResumeCreator creator) {
		this.creator = creator;
	}

	public Worker hireWorker(int wId, String wName, String wSalaryType, int wSalary) {
		Worker worker = creator.createResume(wId, wName, wSalaryType, wSalary);
		return worker;

	}

}
