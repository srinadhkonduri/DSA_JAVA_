package com.singly_linked_list;

public class delete_first_node_in_the_linked_list {
    public static void main(String[] args) {
//        creating an object for the linked list
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

//        chaining the data in the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        display();
        System.out.println("-".repeat(1));
        deleteFirst();
        System.out.println("after deleting");
        display();
    }
//    creating a method that deletes the first node in the linked list
    public static  ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
//    creating a linked list method
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    creating a display method to print the data in the linked list
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
