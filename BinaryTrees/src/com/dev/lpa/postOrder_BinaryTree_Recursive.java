package com.dev.lpa;

public class postOrder_BinaryTree_Recursive {
    public static void main(String[] args) {
        createBinaryTree();
        postOrder(root);
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

//    creating a method for post order traversal using recursion
    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "  ");
    }
}
