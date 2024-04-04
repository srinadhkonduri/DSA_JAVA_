package com.Arrays;

//adding values and updating values in the arrays
public class creatingArray {
    public static void main(String[] args) {
//    running the method that is created
        demoArray();

    }
//    first creating a method for the array
    public static void demoArray(){
//        creating an array using the syntax
        int[] myArray = new int[5];
        printArray(myArray);
        myArray[0] = 3;
        myArray[1] = 4;
        myArray[1] = 9;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
    }
//    creating a print array method
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
//            here while printing the output should loop through the loop of i
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
