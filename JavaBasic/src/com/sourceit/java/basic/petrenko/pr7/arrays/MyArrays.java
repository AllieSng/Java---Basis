package com.sourceit.java.basic.petrenko.pr7.arrays;

import com.sourceit.exercise.IntArrays;

public class MyArrays implements IntArrays {

	public int baseArr[];

	@Override
	public void add(int arg0) {
		if (baseArr == null) {
			baseArr = new int[] { arg0 };
			return;
		}
		int[] newArr = new int[baseArr.length + 1];
		for (int i = 0; i < baseArr.length; i++) {
			newArr[i] = baseArr[i];
			if (i == baseArr.length - 1) {
				newArr[i + 1] = arg0;
			}
		}
		baseArr = newArr;
	}

	@Override
	public int get(int arg0) {
		int el = 0;
		for (int i = 0; i < baseArr.length; i++) {
			if (i == arg0) {
				el = baseArr[i];
			}
		}
		return el;

	}

	@Override
	public int size() {
		return baseArr.length;
	}

	public void delete(int arg0) {
		if (baseArr == null) {
			System.out.println("Empty array");
			return;
		}
		MyArrays newArr = new MyArrays();
		int l = baseArr.length;
		for (int i = 0; i < l; i++) {
			if (baseArr[i] != arg0) {
				newArr.add(baseArr[i]);
			}
		}
		baseArr = newArr.baseArr;
	}

}
