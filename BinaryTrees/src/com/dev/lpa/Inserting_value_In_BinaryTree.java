package com.dev.lpa;
// for inserting a value in the bt we should use the inorder method
public class Inserting_value_In_BinaryTree {
    public static void main(String[] args) {
        Inserting_value_In_BinaryTree bst = new
                Inserting_value_In_BinaryTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        inOrder();
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
    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

//    for printing the data we have to create the inorder method
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "  ");
        inOrder(root.right);
    }

    public static void inOrder(){
        inOrder(root);
    }
}
