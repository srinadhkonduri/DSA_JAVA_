package com.sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,10,2,9};
        array(arr);
        selectionSort(arr);
        array(arr);
    }
    public static void array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] =temp;
        }
    }
}
