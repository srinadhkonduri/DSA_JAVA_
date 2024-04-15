package com.dev.lpa;

public class inorder_binaryTree_recursive {
    public static void main(String[] args) {
        binaryTree();
        inOrder(root);
    }
    private static TreeNode root;
    private static class TreeNode{
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

//    creating a binary tree
    public static void binaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(4);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }

//    inorder traversal of a binary tree
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
