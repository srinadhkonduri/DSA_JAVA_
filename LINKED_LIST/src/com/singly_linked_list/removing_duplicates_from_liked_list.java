package com.singly_linked_list;

public class removing_duplicates_from_liked_list {
    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next =fifth;
        display();
        System.out.println("-".repeat(1));
        removeDuplicates();
        display();
    }
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

//  creating a display method
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current =current.next;
        }
        System.out.print("null");
    }

//    creating a method that removes duplicates from the linked list
    public static void removeDuplicates(){
        if (head == null){
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
