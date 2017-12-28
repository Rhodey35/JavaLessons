package com.lessons.sortingAlgorithms;

public class InsertionSort {
	
public static void main(String[] args) {
		
	
int[] numbers = {64,35,85,34,27,85,34,85,63,26,56,32,86,67,23};
	InsertionSort(numbers);
	for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i]+":");
	}
}


public static void InsertionSort(int[] num) {
	int j, key, i;
	for (j = 0; j < num.length; j++) {
		key = num[j];
		for ( i = j -1; (i >= 0) && (num[i] < key); i--) {
			num[i+1] = num[i];
		}
		num[i+1] = key;
	}
	
}
}

