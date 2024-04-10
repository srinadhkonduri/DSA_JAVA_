package com.singly_linked_list;

public class finding_middle_element_In_linked_list {
    public static void main(String[] args) {
        finding_middle_element_In_linked_list linkedList = new
                finding_middle_element_In_linked_list();
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
        System.out.println("middle node is - " + middle(head));
    }
//    creating a linked list
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

//    creating a method finding the middle node in the linked list
    public static ListNode middle(ListNode head){
        if (head == null){
            return null;
        }
        ListNode tortoise = head;
        ListNode rabbit = head;
        while (rabbit != null && rabbit.next != null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }
        return tortoise;
    }
}
