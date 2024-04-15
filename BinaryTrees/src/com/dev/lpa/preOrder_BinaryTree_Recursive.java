package com.dev.lpa;

public class preOrder_BinaryTree_Recursive {
    public static void main(String[] args) {
        preOrder_BinaryTree_Recursive bt = new
                preOrder_BinaryTree_Recursive();
        createBinaryTree();
        preOrder(root);
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


//    creating a  method for the preorder traversal
    public static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.data + "  ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
