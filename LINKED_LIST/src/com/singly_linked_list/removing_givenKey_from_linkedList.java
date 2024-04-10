package com.singly_linked_list;

public class removing_givenKey_from_linkedList {
    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
//        chaining the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next =fifth;

        display();
        System.out.println("-".repeat(1));
        deleteNode(3);
        display();
    }
    private static ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

//    creating a display method
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }


//    CREATING A METHOD FOR REMOVING A GIVEN KEY FROM LL
    public static void deleteNode(int n){
        if (head == null){
            return;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != n){
            temp = current;
            current = current.next;
        }
        if (current == null) return;
        temp.next = current.next;
    }
}
