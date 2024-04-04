package com.Arrays;

public class move_zeros_end {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2,3};
        printArray(arr);
        moveZeros(arr,6);
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

//    creating a method which moves zeros to the end of the array
    public static void moveZeros(int[] arr, int n){
//        here we are using a two pointer approach
//        j will focus on zeros
//        I will focus on elements
        int j = 0;
        for (int i = 0; i < n; i++) {
//            here i should focus on elements j should focus on zeros
            if (arr[i] != 0 && arr[j] == 0){
//                condition gets true swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
//            j is not equal to zero increment j by 1
            if (arr[j] != 0){
                j++;
            }
        }
    }
}
