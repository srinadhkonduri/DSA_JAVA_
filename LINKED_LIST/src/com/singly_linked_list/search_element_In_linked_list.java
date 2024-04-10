package com.singly_linked_list;

public class search_element_In_linked_list {
    public static void main(String[] args) {
        search_element_In_linked_list ll = new
                search_element_In_linked_list();
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
//        chaining the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        display();
        System.out.println("-".repeat(1));
        if (search(head,3)){
            System.out.println("search key found");
        } else {
            System.out.println("search key not found");
        }
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

//    creating a method to search an element in a linked list
    public static boolean search(ListNode head, int searchPosition){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current != null){
            if (current.data == searchPosition){
                return true;
            }
            current =current.next;
        }
        return false;
    }
}
