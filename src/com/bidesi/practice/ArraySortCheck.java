package com.bidesi.practice;

import java.util.ArrayList;
import java.util.List;

public class ArraySortCheck {

	public static void main(String[] args) {
		List<int[]> arrayList = new ArrayList<>();

		arrayList.add(new int[] { 0, 12, 22, 54, 65, 66 });
		arrayList.add(new int[] { 632, 534, 451, 354, 265, 166 });
		arrayList.add(new int[] { 0, 12 });
		arrayList.add(new int[] { 12 , 8});
		arrayList.add(new int[] {10});
		arrayList.add(new int[] {});

		arrayList.forEach(arr -> {
			boolean isAsc;
			Utility.printArray("Given Array", arr);

			int len = arr.length;
			if (len == 0) {
				System.out.println("Is ArraySorted: false");
			} else if (len == 1 || len == 2) {
				System.out.println("Is ArraySorted: true");
			} else {
				isAsc = Utility.checkIfAscendingOrder(arr, len - 1);
				System.out.println("Is ArraySorted: " + Utility.checkSorted(arr, 0, len - 1, isAsc));
			}
		});
	}

}
