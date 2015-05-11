package com.sourceit.java.basic.petrenko.pr5.loops;

public class FooBar {

	public static void main(String[] args) {
		FooBar f = new FooBar();
		f.fooBar(15);
	}

	public void fooBar(int param) {
		int[] mas = new int[param];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = i + 1;
			int cond1 = mas[i] % 3;
			int cond2 = mas[i] % 5;

			if (cond1 == 0 && cond2 == 0) {
				System.out.println("FooBar");
			} else if (cond2 == 0) {
				System.out.println("Bar");
			} else if (cond1 == 0) {
				System.out.println("Foo");
			} else
				System.out.println(mas[i]);
		}

	}
}
