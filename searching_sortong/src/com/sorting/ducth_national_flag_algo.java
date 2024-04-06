package com.sorting;

public class ducth_national_flag_algo {
    public static void main(String[] args) {
        int[] arr = {2,0,2,2,0,1,1};
        printArray(arr);
        sortThreeNUmbers(arr);
        printArray(arr);
    }
//    creating the print array method
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    creating a swap method
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    creating a sort method
    public static void sortThreeNUmbers(int[]arr){
        int i = 0;
        int j = 0;
        int k =arr.length - 1;
        while (i <= k){
            if (arr[i] == 0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2){
                swap(arr,i,k);
                k--;
            }
        }
    }
}
