package com.bidesi.practice;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr1 = {12, 43, 54, 65, 665};
		int[] arr2 = {65, 33, 53, 676, 66};
		
		Utility.printArray("Before Swap Array-1: ", arr1);
		Utility.printArray("Before Swap Array-2: ", arr2);
		Utility.swapArray(arr1, arr2);
		Utility.printArray("After Swap Array-1: ", arr1);
		Utility.printArray("After Swap Array-2: ", arr2);
	}

	

}
