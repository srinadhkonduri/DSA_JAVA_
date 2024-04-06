package com.sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
//    creating an array method
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    creating the bubble sort method
    public static void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
