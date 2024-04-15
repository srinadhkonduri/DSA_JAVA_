package com.dev.lpa;

import java.util.Stack;

public class inOrder_binaryTree_Iterative {
    public static void main(String[] args) {
        createBinaryTree();
        inOrder(root);
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
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
    }

//    creating a method for printing the tree in the inorder pattern
//    using iterative order
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
//        1 . create a stack for the tree
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if (temp != null){
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + "  ");
                temp = temp.right;
            }
        }
    }
}
