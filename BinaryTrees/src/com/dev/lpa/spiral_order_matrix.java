package com.dev.lpa;

public class spiral_order_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        spiralMatrix(matrix,4,4);
    }

//    crating a method that prints the spiral order matrix
    public static void spiralMatrix(int[][] matrix,int r,int c){
//        declaring a variables
        int i =0 , k = 0;
        int l = 0;
        while (k < r && i < c){
            for (l = 0; l < c; l++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < r; i++) {
                System.out.print(matrix[i][c-1] + " ");
            }
            c--;
            if (k < r){
                for (i = c-1;i >= 1; i--){
                    System.out.print(matrix[r-1][i] + " ");
                }
                r--;
            }
            if (l < c){
                for ( i = r-1; i >= k; i--) {
                    System.out.print(matrix[i][i] + " ");
                }
                i++;
            }
        }
    }
}
