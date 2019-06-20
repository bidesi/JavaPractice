package com.bidesi.practice;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {12, 2, 54, 65, 6};
		Utility.printArray("Given Array : ", arr);
		
		int len = arr.length;
		Utility.quickSort(arr, 0 , len-1);
		
		Utility.printArray("After Quick Sort: ", arr);
	}

}
