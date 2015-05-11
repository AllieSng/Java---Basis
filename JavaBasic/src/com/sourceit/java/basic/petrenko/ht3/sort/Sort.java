package com.sourceit.java.basic.petrenko.ht3.sort;

/**
 * 
 * @author alinapetrenko
 *
 */

public class Sort {

	public static void main(String[] args) {
		
		//Original data
		int arr[] = new int[] {23, 33, 4, 0, 6, 43, 5, 3, 99, 444};
		int arr2[] = new int[] {33, 54, 8, 9, 5, 0, 3, 54, 6, 11};
		try{
			bubbleSearch(arr);
			insertionSort(arr2);
		} catch (NullPointerException e){
			System.out.println("Empty array");
		}
	}
	
	public static void bubbleSearch(int arr[]){
		System.out.println("Bubble search");
		printOrigin(arr);
		int flag = 1;
		while(flag == 1){
		for (int i = 0; i < arr.length; i++){
			flag = 0;
			for (int j = i+1; j< arr.length; j++){
				if(arr[i] > arr[j]){
				int temp = arr[i];
				arr [i] = arr [j];
				arr [j] = temp;
				flag = 1;
				}
				}
			}
		}
		printSorted(arr);
	}
	
	public static void insertionSort(int arr[]){
		System.out.println("Insertion search");
		printOrigin(arr);
		for(int i = 0; i< arr.length; i++){
			int temp = arr[i];
			int j = i - 1;
			while (j>=0 && arr[j] > temp){
				arr[j+1] = arr[j];
				j = j - 1;
				arr[j+1] = temp;
			}
		}
		printSorted(arr);
	}
	
	public static void printOrigin(int arr[]){
		System.out.println("Original: " );
		for (int element : arr)
	          System.out.print(element + " ");
	      System.out.println();
	}
	
	public static void printSorted(int arr[]){
		System.out.println("Sorted: " );
		for (int element : arr)
	          System.out.print(element + " ");
	      System.out.println();
	}

}
