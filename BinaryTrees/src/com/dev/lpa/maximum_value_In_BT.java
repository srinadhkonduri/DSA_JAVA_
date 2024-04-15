package com.dev.lpa;

public class maximum_value_In_BT {
    public static void main(String[] args) {
        createBinaryTree();
        System.out.println("the maximum value of int the" +
                "binary tree is = " + findMaximum(root));
    }
    private static TreeNode root;
    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void createBinaryTree(){
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(7);
        TreeNode fouth = new TreeNode(5);
        TreeNode fifth = new TreeNode(8);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fouth;
        second.right = fifth;

    }

//    creating a method that finds the maximum element in the binary tree
    public static int findMaximum(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMaximum(root.left);
        int right = findMaximum(root.right);
        if (left > result){
            result = left;
        }
        if (right > result){
            result = right;
        }
        return result;
    }
}
