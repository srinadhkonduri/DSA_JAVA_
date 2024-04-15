package com.dev.lpa;

public class search_Node_In_BT {
    public static void main(String[] args) {
        creatingBinaryTree();
        inOrder();
        if (null != search(3)){
            System.out.println("key is found");
        } else {
            System.out.println("key is not found");
        }
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

//    creating a binary tree
    public static void creatingBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

//  creating a method to finding the given element in the given tree
    public static TreeNode search(int value){
        return search(root,value);
    }
    public static TreeNode search(TreeNode root,int key){
        if (root == null || root.data == key){
            return root;
        }
        if (key < root.data){
            return search(root.left,key);
        } else {
            return search(root.right,key);
        }
    }

//    creating the inorder method for finding the nodes in the tree
    public static void inOrder(){
        inOrder(root);
    }
    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + "  ");
        inOrder(root.right);
    }
}
