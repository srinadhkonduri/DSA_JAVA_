package com.singly_linked_list;

public class reversing_linkedList {
    public static void main(String[] args) {
        reversing_linkedList ll = new
                reversing_linkedList();
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
//        chaining the constructor
        head.next = second;
        second.next = third;
        third.next =fourth;
        fourth.next =fifth;
        display();
        reverse(head);
    }
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

//    creating a display method
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "  ---> ");
            current = current.next;
        }
        System.out.print("null");
    }

//    creating a method to reverse the linked list
    public static ListNode reverse(ListNode head){
//        for every method base case is important
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
