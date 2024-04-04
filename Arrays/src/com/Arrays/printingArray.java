package com.Arrays;

public class printingArray {
    public static void main(String[] args) {
        Object arr = new Object();
        int[] ans = new int[]{printArray(new int[5])};
        System.out.println(ans);
    }
//    creating a method
    public static int printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return n;
    }
}
