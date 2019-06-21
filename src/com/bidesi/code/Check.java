package com.bidesi.code;
public class Check {

    public static void main(String[] args) {
    	int[] input = { 10, 15, 1, 4, 28, 7};
    	//int temp = 0;
    	for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j + i < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    System.out.println(temp);
                }
            }
        }
    	//System.out.println(temp);
    }
}
