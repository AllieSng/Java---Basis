package com.sourceit.java.basic.petrenko.pr9.wrappers;

public class TestWrappers2 {
	public static void main(String[] args) {

		String s = args[0];
		System.out.println("params : " + s);

		StringBuilder result = new StringBuilder();
		

		// ***** 1 **** //
		char[] charArray = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			// result.append(charArray[i]);
			result.append(s.charAt(i));
			
		}
		
		// ***** 2 **** //
		for (int i = 0; i < s.length(); i++) {
		result.append(s.charAt(s.length() - i - 1));
		}

		// ***** 3 **** //
		// T
		// iT
		// tiT
		for (char c : s.toCharArray()) {
			result.insert(0, c);
		}
		System.out.println(result);
		System.out.println("result :".substring(0, 3)); // result= String

		// *****************
		char[] charArr2 = { 'T', 'i', 't' };
		char[] charArr3 = new char[3];
		charArr3[0] = 'T';
		charArr3[1] = 'i';
		// *****************

	}

}
