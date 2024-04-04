package com.Arrays;

public class find_Second_Max {
    public static void main(String[] args) {
        int[] arr = {13,34,2,34,33,3};
        printArray(arr);
        findSecondMax(arr);
        System.out.println(findSecondMax(arr));
    }
//    creating the print array method
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    creating the method for second max element
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
//                secondMax = max;
                arr[i] = max;
            } else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
