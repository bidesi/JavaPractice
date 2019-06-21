package com.bidesi.code;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {12, 34, 53, 22, 98, 76, 90, 100, 43, 2, 34};

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }

    static void bubbleSort(int[] arr){
        int arrLength = arr.length;
        for(int i = 0 ; i < arrLength; i++){
            for(int j = 0; j < arrLength - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
