package com.singly_linked_list;

public class length_of_linked_list {
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
        length_of_linked_list ll = new length_of_linked_list();
        ll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        ll.head = second;
        second.next =third;
        third.next =fourth;

//        calling the methods to be printed
        display();
        System.out.println("-".repeat(10));
        System.out.println("length is = " + length());
    }

//    here the display method is more important to print the
//    values in the linked list
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

//    creating a method to print the length of the linked list
    public static int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
