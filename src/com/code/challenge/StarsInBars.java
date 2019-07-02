package com.code.challenge;

public class StarsInBars {
	public static void main(String[] args) {

		String str = "*|**|****|***|**|*";
		int startIndex = 2;
		int endIndex = 15;
		
		int numOfStars = findStars(str, startIndex, endIndex);
		System.out.println(numOfStars);
		int count = countNoOfStars(str, startIndex, endIndex);
		System.out.println(count);
	}

	private static int findStars(String str, int startIndex, int endIndex) {
		int totalStars = 0;
		int len = str.length();
		
		if(startIndex > -1 && startIndex < len &&  endIndex > startIndex && startIndex < len) {
			while(startIndex < endIndex) {
				if(str.charAt(startIndex) == '|') {
					break;
				}
				startIndex++;
			}
			
			while(endIndex > startIndex) {
				if(str.charAt(endIndex) == '|') {
					break;
				}
				endIndex--;
			}
			
			while(startIndex <= endIndex) {
				if(str.charAt(startIndex) == '*') {
					totalStars++;
				}
				startIndex++;
			}
			
			
//			String subStr = str.substring(startIndex, endIndex+1);
//			
//			String[] subStrArr = subStr.split("\\|");
//			for(String s : subStrArr) {
//				totalStars += s.length();
//			}
		}
		
		return totalStars;
	}
	
	
	public static int countNoOfStars(String str, int startIndex, int endIndex) {

		int firstIndexOfBar = 0;
		int lastIndexOfBar = 0;
		boolean isFirstIndexFound = false;
		int countBar = 0;
		
		for (int i = startIndex; i <= endIndex; i++) {
			if (str.charAt(i) == '|' && !isFirstIndexFound) {
				firstIndexOfBar = i;
				countBar++;
				isFirstIndexFound = true;
			} else if (str.charAt(i) == '|') {
				lastIndexOfBar = i;
				countBar++;
			}
		}
		
		return (lastIndexOfBar - firstIndexOfBar) - (countBar - 1);
	}
}
