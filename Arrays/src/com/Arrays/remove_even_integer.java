package com.Arrays;
// this program took 112 lines of explanation to run
public class remove_even_integer {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        printArray(arr);
        int[] result = removeEvenInteger(arr);
        printArray(result);

    }
//    creating a print array method
    public static void printArray(int[] arr){
//        helps to print array in the output
//        declaring the size of the array
        int n = arr.length;
//        traversing the whole array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        just printing the next line
        System.out.println();
    }
//  creating the remove even integer method
    public static int[] removeEvenInteger(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
//        creating an array dataType to store the result
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
}
