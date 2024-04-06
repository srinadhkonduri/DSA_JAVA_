package com.sorting;

public class MergeSort {
//    creating a print array method
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


//    creating the sort array method
    public void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) { // base case
            int mid = low + (high - low) / 2; // overflow condition (low + high) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }


//    creating a merge method
    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
//        runs a for loop up to condition is true
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low; // traverse left sorted sub array
        int j = mid + 1; // traverse right sorted sub array
        int k = low; // will merge both arrays into original array (arr)

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 5, 2, 4, 3, -1 };
        MergeSort ms = new MergeSort();
        ms.printArray(arr);
        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        System.out.println("after sorting");
        ms.printArray(arr);
    }
}
