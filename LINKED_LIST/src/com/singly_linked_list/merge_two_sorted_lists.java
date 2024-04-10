package com.singly_linked_list;

public class merge_two_sorted_lists {
    public static void main(String[] args) {
        merge_two_sorted_lists sll1 = new merge_two_sorted_lists();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);

        merge_two_sorted_lists sll2 = new merge_two_sorted_lists();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);
        sll1.display();
//        System.out.println("-");
        sll2.display();
        merge_two_sorted_lists result = new merge_two_sorted_lists();
        System.out.println("-");
        result.head = merge(sll1.head,sll2.head);
        result.display();

    }
//    creating a method to insert the values of linked list in the last
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
            if (head == null) {
            head = newNode;
            return;
            }
            ListNode current = head;
            while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
//    creating a linked list body
    private static ListNode head;
    private static class ListNode {
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

//    creating a method for merging two sorted linked list
    public static ListNode merge(ListNode a , ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }
}
