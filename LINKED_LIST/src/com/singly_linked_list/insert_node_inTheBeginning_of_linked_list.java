package com.singly_linked_list;

public class insert_node_inTheBeginning_of_linked_list {
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        insert_node_inTheBeginning_of_linked_list ll = new
                insert_node_inTheBeginning_of_linked_list();
        insert(11);
        insert(8);
        insert(1);
        display();
    }

//    creating a method to insert an element in the begining
//    of a linked list
    public static void insert(int value){
        ListNode newNode = new ListNode(value);
//        assign new node = head
        newNode.next = head;
//        make head = new node
        head = newNode;
    }

//    creating a display method to print the data
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
