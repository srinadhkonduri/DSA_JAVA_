package com.sorting;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {8,-3,5,2,6,9,-6,1,38};
        printArray(arr);
        sort(arr,0,8);
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

//  creating a partition method
    public static int partition(int[] arr, int low , int high){
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i <= high){
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

//    creating a sort method
    public static void sort(int[] arr, int low , int high){
        if (low < high){
            int p = partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }
}
