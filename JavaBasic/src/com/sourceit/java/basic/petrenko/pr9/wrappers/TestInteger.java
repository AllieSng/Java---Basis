package com.sourceit.java.basic.petrenko.pr9.wrappers;

public class TestInteger {
	public static void main(String[] args) {
		try {
			int len = args.length;
			int sum = 0;
			if (len == 1) {
				System.out.println("Enter more arguments");
				return;
			} else
				for (int i = 0; i < len; i++) {
					int el = Integer.parseInt(args[i]);
					sum += el;
				}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
