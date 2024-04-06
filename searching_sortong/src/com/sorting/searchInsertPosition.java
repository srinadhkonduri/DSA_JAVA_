package com.sorting;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,65,75,88,90,99};
        int result = binarySearch(arr,78);
        System.out.println(result);
    }
    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low)/ 2;
            if (arr[mid] == key) return mid;
            if (key < arr[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
//        change -1 to low to find the insert position of the array
        return low;
    }
}
