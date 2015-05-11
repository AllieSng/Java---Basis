package com.sourceit.java.basic.petrenko.pr7.arrays;

public class Test{

	public static void main(String[] args) {
		MyArrays testArr = new MyArrays();
		
		testArr.add(1);
		testArr.add(150);
		
		System.out.println(testArr.size()); //2
		System.out.println(testArr.get(1)); //150
		
		testArr.add(1506);
		testArr.delete(150);
		testArr.delete(1);
		System.out.println(testArr.size()); //1
	}

}