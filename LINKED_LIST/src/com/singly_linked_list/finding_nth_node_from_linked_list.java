package com.singly_linked_list;

public class finding_nth_node_from_linked_list {
    public static void main(String[] args) {
        finding_nth_node_from_linked_list ll = new
                finding_nth_node_from_linked_list();
        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
//        chaining the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ll.display();
        ListNode nthNode = ll.findingNthNode(2);
        System.out.println("n th node from the end is - " + nthNode.data);
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

//    creating a method for finding nth element in the end from ll
    public static ListNode findingNthNode(int n){
        if (head == null){
            return null;
        }
        if (n <= 0){
            throw new IllegalArgumentException("invalid n -" + n);
        }
        ListNode mainptr = head;
        ListNode refptr = head;
        int count = 0;
        while (count < n){
            if (refptr == null){
                throw new IllegalArgumentException(n +
                        "greater than the number of nodes in the list");
            }
            refptr = refptr.next;
            count++;
        }
        while (refptr != null){
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;
    }
}
