package com.singly_linked_list;

public class delete_lastNode_In_the_linked_list {
    public static void main(String[] args) {
        delete_lastNode_In_the_linked_list ll = new
                delete_lastNode_In_the_linked_list();
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

//        chaining the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        display();
        System.out.println("-".repeat(1));
        deleteLast();
        display();
    }

//    creating a method to delete last node in the linked list
    public static ListNode deleteLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
//    creating a linked list
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    creating a display method for the linked list
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
