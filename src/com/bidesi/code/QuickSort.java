package com.bidesi.code;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {23, 43, 12, 54, 1, 5, 4, 0};
		int len = arr.length;
		sort(arr, 0, len - 1);
		printArray(arr, len);
	}

	private static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int partIndex = partition(arr, start, end);
			sort(arr, start, partIndex - 1);
			sort(arr, partIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int wall = start;
		
		for(int i = start; i < end; i++) {
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[wall];
				arr[wall] = temp;
				wall++;
			}
		}
		
		arr[end] = arr[wall];
		arr[wall] = pivot;
		
		return wall;
	}

	private static void printArray(int[] arr, int len) {
		for(int i = 0; i < len; i++)
			System.out.println(arr[i]);
	}

}
