package com.singly_linked_list;

public class removing_loop_from_linkedList {
    public static void main(String[] args) {
        containsLoop();
        display();
//        removeLoop();
//        display();
    }

    private static void containsLoop(){
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
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
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }

//    creating a method which removes loop from a linked list
    public static void removeLoop(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while (fastptr == null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr){
                removeLoops(slowptr);
                return;
            }
        }
    }

//    creating a remove loop method
    public static void removeLoops(ListNode slowptr){
        ListNode temp = head;
        while (slowptr.next != temp.next){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        slowptr = slowptr.next;
    }
}
