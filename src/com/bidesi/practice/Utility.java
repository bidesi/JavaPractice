package com.bidesi.practice;

public class Utility {

	public static void swapArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;

		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				int temp = arr1[i];
				arr1[i] = arr2[i];
				arr2[i] = temp;
			}
		}

	}

	public static void printArray(String message, int[] arr) {
		System.out.print(message+": ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void print2DimArray(String message, int[][] arr) {
		int len = arr.length;
		System.out.println(message);
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void reverseArray(int[] arr) {
		int len = arr.length;
		if (len > 0) {
			for (int i = 0; i < len - 1; i++) {
				int temp = arr[i];
				arr[i] = arr[len - 1];
				arr[len - 1] = temp;
				len--;
			}
		}

	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	public static void quickSort(int[][] arr, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}

	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int partitionIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr, end, partitionIndex);

		return partitionIndex;

	}

	private static int partition(int[][] arr, int start, int end) {
		int pivot = arr[end][0] + arr[end][1];
		int partitionIndex = start;

		for (int i = start; i < end; i++) {
			if (arr[i][0] + arr[i][1] <= pivot) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}

		swap(arr, end, partitionIndex);

		return partitionIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void swap(int[][] arr, int place1, int place2) {
		for (int i = 0; i < 2; i++) {
			int temp = arr[place1][i];
			arr[place1][i] = arr[place2][i];
			arr[place2][i] = temp;
		}

	}

	public static boolean checkSorted(int[] arr, int start, int end, boolean isAsc) {
		while (start < end) {
			if (isAsc) {
				if (arr[start] <= arr[start + 1]) {
					checkSorted(arr, ++start, end, isAsc);
				} else {
					return false;
				}
			} else {
				if (arr[start] >= arr[start + 1]) {
					checkSorted(arr, ++start, end, isAsc);
				} else {
					return false;
				}
			}

		}
		return true;
	}

	public static boolean checkIfAscendingOrder(int[] arr, int len) {
		for (int i = 1; i < len; i++) {
			if (arr[0] < arr[i]) {
				return true;
			} else if (arr[0] > arr[i]) {
				return false;
			}
		}
		return true;
	}
}
