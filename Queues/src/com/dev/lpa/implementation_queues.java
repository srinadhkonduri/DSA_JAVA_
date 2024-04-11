package com.dev.lpa;

import java.util.NoSuchElementException;

public class implementation_queues {
    public static void main(String[] args) {
        implementation_queues qq = new implementation_queues();
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        deQueue();
        print();
    }

    public implementation_queues() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private static ListNode front;
    private static ListNode rear;
    private static int length;


    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int length(){
        return length;
    }
    public static boolean isEmpty(){
        return length == 0;
    }

//    creating a method to push the data in to the queue
    public static void enQueue(int data){
        ListNode temp = new ListNode(data);
        if (isEmpty()){
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

//    creating a method to remove elements from the queue
    public static int deQueue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if (front == null){
            rear = null;
            length--;
        }
        return result;
    }
//    creating a method to print the data in the queue
    public static void print(){
        ListNode current = front;
        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
