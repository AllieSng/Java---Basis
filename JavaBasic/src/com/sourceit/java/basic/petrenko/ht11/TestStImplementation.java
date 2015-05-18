package com.sourceit.java.basic.petrenko.ht11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStImplementation extends TextStatistics {

	public TestStImplementation(String text) {
		super(text);
	}

	@Override
	public int getCharFrequency(char c) {
		int count = 0;
		char mas[] = this.getText().toCharArray();
		for (char el : mas) {
			if (el == c) {
				count++;
			}
		}
		System.out.print("Frequency of appearing '" + c + "' from "
				+ mas.length + " symbols is ");
		return (count * 100) / mas.length;
	}

	@Override
	public int getCharCount(char c) {
		int count = 0;
		char mas[] = this.getText().toCharArray();
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == c) {
				count++;
			}
		}
		System.out.print("The number of characters in text '" + c + "' is ");
		return count;
	}

	@Override
	public Map<String, Integer> getChars() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] mas = this.getText().split("");
		for (String el : mas) {
			if (!hm.containsKey(el)) {
				if(!el.isEmpty() & el != " "){
					hm.put(el, 1);
				}		
			} else {
				hm.put(el, hm.get(el) + 1);
			}
		}
		return hm;
	}

	@Override
	public List<String> words() {
		List<String> arrlist = new ArrayList<String>(Arrays.asList(this
				.getText().split(" ")));
		System.out.println("Text is:");
		return arrlist;
	}

	@Override
	public int getMostPopularCharCount() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] mas = this.getText().split("");
		for (String el : mas) {
			if (!hm.containsKey(el)) {
				hm.put(el, 1);
			} else {
				hm.put(el, hm.get(el) + 1);
			}
		}
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : set) {
			if (maxEntry == null
					|| entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		return maxEntry.getValue();
	}

	@Override
	public int getLeastPopularCharCount() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] mas = this.getText().split("");
		for (String el : mas) {
			if (!hm.containsKey(el)) {
				hm.put(el, 1);
			} else {
				hm.put(el, hm.get(el) + 1);
			}
		}
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		Map.Entry<String, Integer> minEntry = null;
		for (Map.Entry<String, Integer> entry : set) {
			if (minEntry == null
					|| entry.getValue().compareTo(minEntry.getValue()) < 0) {
				minEntry = entry;
			}
		}
		return minEntry.getValue();
	}

	@Override
	public char getCharByCount(int count) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char mas[] = this.getText().toCharArray();
		for (char el : mas) {
			if (!hm.containsKey(el)) {
				hm.put(el, 1);
			} else {
				hm.put(el, hm.get(el) + 1);
			}
		}
		Set<Map.Entry<Character, Integer>> set = hm.entrySet();
		if (!hm.containsValue(count)) {
			System.out.println("No such element");
			return 0;
		} else {
			Map.Entry<Character, Integer> tempEntry = null;
			for (Map.Entry<Character, Integer> entry : set) {
				if (entry.getValue() == count) {
					tempEntry = entry;
				}
			}
			return tempEntry.getKey();
		}
	}
}