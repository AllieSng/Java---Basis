package com.sourceit.java.basic.petrenko.pr4.binarysearch;

//http://showtrip.ru/binarny-j-poisk/
public class BinarySearch {
  public static void main(String[] args) {
  	
      // массив, в котором будем осуществл€ть поиск
      int[] mas = new int[]{1, 2, 3, 4, 5};
      System.out.println("ќтсортированный входной массив:");
      for (int element : mas)
          System.out.print(element + " ");
      System.out.println();
      
      // элемент (ключ), который ищем
      int search = 2;
      System.out.println("„исло " + search + " найдено в позиции " + binarySearch(mas, search));
  }

  public static int binarySearch(int[] array, int key) {
      int low = 0;
      int high = array.length - 1; //индекс посл.элементаa
      while (low <= high) { //пока не останетс€ единичный интервал
          int middle = low + (high - low) / 2;
          if (key < array[middle]) //9 < [5]6
              high = middle - 1;
          else {
              if (key > array[middle])
                  low = middle + 1; // [6]7
              else
                  return middle;
          }
      }
      return -1;
  }
}