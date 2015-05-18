package com.sourceit.java.basic.petrenko.ht12.toys;

public class Launcher12 {

	public static void main(String[] args) {

		Employee ivan = new Employee(1, "Ivan", "Petrov");
		Employee vasil = new Employee(2, "Vasyl", "Myronrko");
		Employee igor1 = new Employee(3, "Igor", "Kazakow");
		Employee igor2 = new Employee(4, "Igor", "Vetrov");
		Employee employees[] = {ivan, vasil, igor1, igor2};
		
		Company WTI = new Company("WTI", employees);
		WTI.giveAFreeToy(employees);
		WTI.nameNewProduct(employees);
		WTI.choosePopularName(employees);
		WTI.acquireTicketsForLacrosse(employees);
	}
}
