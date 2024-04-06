package com.searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,65,75,88,99};
        System.out.println(binarySearch(arr,65));
    }
    public static int binarySearch(int[] nums,int key){
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/ 2;
            if (nums[mid] == key) return mid;
            if (key < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
