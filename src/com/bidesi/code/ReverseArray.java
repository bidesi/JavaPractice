package com.bidesi.code;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {12, 43, 54, 65, 665};
		
		Utility.printArray("Array : ", arr);
		Utility.reverseArray(arr);
		Utility.printArray("Reversed Array: ", arr);
	}
}
