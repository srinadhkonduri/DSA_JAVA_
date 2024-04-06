package com.sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,9,2,10};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
//    creating a print array method
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    creating the method for running insertion sort
    public static void insertionSort(int[] arr){
        int n = arr.length;
//        here in insertion sort the loop must start from 1
//        because the 0 index is already sorted
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }
    }
}
