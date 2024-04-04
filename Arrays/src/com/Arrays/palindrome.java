package com.Arrays;

public class palindrome {
    public static void main(String[] args) {

        if (isPalindrome("madam") == true){
            System.out.println("the given string is palindrome");
        }
        else {
            System.out.println("the given string is not palindrome");
        }
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String name){
        char[] charArray = name.toCharArray();
        int start = 0;
        int end = name.length() - 1;
        while (start < end){
            if (charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
