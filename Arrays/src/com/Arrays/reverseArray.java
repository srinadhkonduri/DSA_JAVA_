package com.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8};
        printArray(arr);
        reverseArrays(arr,0,arr.length-1);
        printArray(arr);
    }
//    creating the print array method to print the array
    public static void printArray(int[] arr){
//        helps to print array in the output
//        declaring the size of the array
        int n = arr.length;
//        traversing the whole array
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
//        just printing the next line
        System.out.println();
    }
    public static void reverseArrays(int num[], int start, int end){
        while (start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
