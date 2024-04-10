package com.singly_linked_list;

public class insert_node_at_given_position {
//    1 . creating the head of the linked list
    private static ListNode head;

//    2 . creating the body of the linked list
    private static class ListNode{
        private final int data;
        private ListNode next;

//        creating a constructor

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
//        in the main method we are creating an object of linked list
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
        insert(2,6);
        display();
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

  //   creating a method for inserting a node at given position
    public static void insert(int position,int value){
//      creating a base position
//        passing the value reference in the list node
        ListNode node = new ListNode(value);
//        creating a base condition for the LL
        if (position == 1){
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            node.next = previous.next;
            previous.next = node;
        }

    }
}
}
