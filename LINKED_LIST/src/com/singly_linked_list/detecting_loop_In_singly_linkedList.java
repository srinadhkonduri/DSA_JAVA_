package com.singly_linked_list;

public class detecting_loop_In_singly_linkedList {
    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
//        chaining the constructor
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
//        the last chain contains loop in the linked list
        sixth.next = third;
        display();

    }

    private static ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
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

//    creating a method to detect the loop in a linked list
    public static boolean detectLoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr){
                return true;
            }
        }
        return false;
    }
}
