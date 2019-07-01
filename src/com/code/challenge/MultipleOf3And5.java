package com.code.challenge;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		System.out.println(getSum(10));
	}
	
	public static int getSum(int nVal) {
        int sum = 0;
        if(nVal >= 3){
            int start = 3;
            while(start < nVal){
                if(start % 3 == 0 || start % 5 == 0){
                    sum += start;
                }
                start++;
            }
        }
        return sum;
    }
}
