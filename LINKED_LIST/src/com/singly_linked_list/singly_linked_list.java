package com.singly_linked_list;

public class singly_linked_list {

//    1 . first creating the head part of the node
    private static ListNode head;
//    2 . creating a class list node
    private static class ListNode {
//        3 . two field access data and next value
        private int data;
        private ListNode next;

//        4 . creating a constructor of two fields data and null
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    5 . creating a main method
    public static void main(String[] args) {
        singly_linked_list sll = new singly_linked_list();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

//        6 . chaining the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
//        calling the display method
        display();
    }

//    creating a display method to print the result
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
