package com.code.challenge;

import java.util.ArrayList;
import java.util.List;

public class StarsInBars {

	public static void main(String[] args) {
		String starsBars = "*|**||***|**||**|**|*";
		List<Integer> startIndexes = new ArrayList<Integer>();
		List<Integer> endIndexes = new ArrayList<Integer>();
		
		startIndexes.add(1);
		startIndexes.add(2);
		startIndexes.add(3);
		startIndexes.add(4);
		startIndexes.add(5);
		startIndexes.add(6);
		startIndexes.add(7);
		startIndexes.add(8);
		startIndexes.add(9);
		startIndexes.add(10);
		
		endIndexes.add(11);
		endIndexes.add(12);
		endIndexes.add(13);
		endIndexes.add(14);
		endIndexes.add(15);
		endIndexes.add(16);
		endIndexes.add(17);
		endIndexes.add(18);
		endIndexes.add(19);
		endIndexes.add(20);
		
		int[] starsInsideBars = findStarsInsideBars(starsBars, startIndexes, endIndexes);
		System.out.println("Results: "+ starsInsideBars);
	}

	private static int[] findStarsInsideBars(String starsBars, List<Integer> startIndexes, List<Integer> endIndexes) {
		// TODO Auto-generated method stub
		return null;
	}

}
