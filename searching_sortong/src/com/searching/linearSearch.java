package com.searching;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {5,1,3,6,8,9,4};
        printArray(arr);
        int result = search(arr,7,9);
        System.out.println("the result is at the index = " + result);
    }
    public static void printArray(int[] arr){
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int search(int[] arr,int n ,int target){
        for (int i = 0; i < n; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
