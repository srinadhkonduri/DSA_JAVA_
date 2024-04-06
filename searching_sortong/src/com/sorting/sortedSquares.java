package com.sorting;

public class sortedSquares {
    public static void main(String[] args) {
        result();
    }
    public static void result(){
        int[] arr = {-4,-1,0,3,10};
        printArray(arr);
        int[] result = sortedSquares(arr);
        printArray(result);
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    sorted squares method
    public static int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i = 0 , j = n - 1;
        for (int k = n - 1; k >= 0 ; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }
}
