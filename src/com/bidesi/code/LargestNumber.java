package com.bidesi.code;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 40, 10};
		int length = arr.length;
		sortNumbers(arr, 0, length-1);
		System.out.println("Largest Number possible in the givwn array: ");
		printNumbers(arr, length);
	}

	private static void printNumbers(int[] arr, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i]);
		}
		
	}

	private static void sortNumbers(int[] arr, int start, int end) {
		if(start < end) {
			int partitionIndex = partition(arr, start, end);
			sortNumbers(arr, start, partitionIndex - 1);
			sortNumbers(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int partitionIndex = start;
		
		while(start < end) {
			if(isSmallestNumberFormed(arr[start],  pivot)) {
				swap(arr, start, partitionIndex);
				partitionIndex++;
			}
			start++;
		}
		
		swap(arr, end, partitionIndex);
		
		return partitionIndex;
	}

	private static boolean isSmallestNumberFormed(int firstNum, int secondNum) {
		int num1 = Integer.parseInt(firstNum +""+ secondNum);
		int num2 = Integer.parseInt(secondNum +""+ firstNum);
		if(num1 < num2) {
			return false;
		}
		return true;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
