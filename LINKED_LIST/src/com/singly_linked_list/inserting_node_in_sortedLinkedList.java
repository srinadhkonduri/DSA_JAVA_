package com.singly_linked_list;

public class inserting_node_in_sortedLinkedList {
    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        display();
        System.out.println("-");
        insert(3);
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

//    creating a display method
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }

//    creating a method to inserting a node in a singly linked list
    public static ListNode insert(int n){
        ListNode newNode = new ListNode(n);
        if (head == null){
            return null;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
}
