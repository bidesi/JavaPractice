package com.bidesi.code;
public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {23, 43, 12, 30, 5, 438, 32, 54, 32, 56};

        int arrLength = arr.length;
        for(int i = 0; i < arrLength - 1; i++){
            int smallestNumIndex = i;

            for(int j = i + 1 ; j < arrLength; j++){
                if(arr[j] < arr[smallestNumIndex]){
                    smallestNumIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestNumIndex];
            arr[smallestNumIndex] = temp;

        }

        for(int i = 0; i < arrLength; i++){
            System.out.println(arr[i]);
        }

    }

}
