package com.bidesi.code;

import java.util.ArrayList;
import java.util.Comparator;

public class SortString {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		String str = "hi i am a programmer";
		String[] arr = str.split(" ");
		for(String s: arr) {
			strList.add(s);
		}
		
		System.out.println(strList);
		strList.sort(Comparator.naturalOrder());
		
		System.out.println("Sorted List: "+ strList);
	}

}
