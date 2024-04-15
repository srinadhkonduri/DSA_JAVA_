package com.dev.lpa;

public class searching_row_column_matrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,41}
        };
        search(matrix,matrix.length,37);
    }

//    creating a method for searching an element in the sorted matrix
    public static void search(int[][] matrix,int n,int x){
        int i = 0;
        int j = n-1;
        while (i < n && j >= 0){
            if (matrix[i][j] == x){
                System.out.println("x found at = " + i + "," + j);
                return;
            }
            if (matrix[i][j] > x){
                j--;
            } else {
                i++;
            }
        }
        System.out.println("not found the element in the matrix");
    }
}
