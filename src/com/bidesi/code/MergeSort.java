/**
 * 
 */
package com.bidesi.code;

/**
 * @author Bidesi
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {12, 23, 32, 13, 0};
		
		int arrLen = arr.length;
		mergeSort(arr, 0, arrLen-1);
		printArray(arr, arrLen);
	}

	/**
	 * Method to print the array
	 * @param arr
	 * @param arrLen
	 */
	private static void printArray(int[] arr, int arrLen) {
		for(int i = 0; i < arrLen; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr, l, m, r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		
		int lenL = m - l + 1;
		int lenR = r - m;
		
		int[] lArr = new int[lenL];
		int[] rArr = new int[lenR];
		
		for(int i = 0; i< lenL; ++i) 
			lArr[i] = arr[l + i];
		
		for(int j = 0; j< lenR; ++j) 
			rArr[j] = arr[m + j + 1];
		
		int i = 0, j = 0, k = l;
		
		while(i < lenL && j < lenR) {
			if(lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		
		if(i < lenL) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		if(j < lenR) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
		
	}

}
