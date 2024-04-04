package com.Arrays;

public class findMinimumElement {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        printArray(arr);
//        findMinimum(arr);
        System.out.println(findMinimum(arr));
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMinimum(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0]; // min will hold the minimum of array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
