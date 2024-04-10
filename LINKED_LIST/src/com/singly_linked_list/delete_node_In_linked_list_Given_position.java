package com.singly_linked_list;

public class delete_node_In_linked_list_Given_position {
    public static void main(String[] args) {
        delete_node_In_linked_list_Given_position ll = new
                delete_node_In_linked_list_Given_position();
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
//        chaining the data to the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        display();
        System.out.println("-");
        delete(3);
        display();
    }
//    creating the linked list body
//    creating the linked list head
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

//        creating a constructor

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    creating a display method for printing the data in LL
    public static void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }

//    creating a method to delete a node at a given position
    public static void delete(int position){
        if (position == 1){
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
}
