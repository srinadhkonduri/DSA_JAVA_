package com.singly_linked_list;

public class insert_node_end_of_the_linked_list {
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
        insert_node_end_of_the_linked_list ll =
                new insert_node_end_of_the_linked_list();

        insertEnd(20);
        insertEnd(30);
        insertEnd(40);
        display();

    }

//    this is the main code for inserting the data in the
//    end of the linked list
    public static void insertEnd(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.next + " --> ");
            current =current.next;
        }
        System.out.print("null");
    }
}
