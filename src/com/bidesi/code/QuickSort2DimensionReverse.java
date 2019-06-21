package com.bidesi.code;

public class QuickSort2DimensionReverse {

	public static void main(String[] args) {
		int[][] arr = {{12, 6}, {2, 10}, {8, 54}, {65, 6}};
		
		Utility.print2DimArray("Given Array : ", arr);
		
		int len = arr.length;
		Utility.quickSort(arr, 0 , len-1);
		
		Utility.print2DimArray("After Quick Sort: ", arr);
	}
}
