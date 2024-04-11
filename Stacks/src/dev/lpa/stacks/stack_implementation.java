package dev.lpa.stacks;

import java.util.EmptyStackException;

public class stack_implementation {
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println(peek());
        pop();
        System.out.println(peek());
    }
//    creating a stack
//    uses LIFO = last in first out
    private static ListNode top;
    private static int length;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    creating a method stack
    public static void stack(){
        top = null;
        length = 0;
    }

//    creating a length method to represent the length of the stack
    public static int length(){
        return length;
    }

//    creating a method that represents if the stack is empty or not
    public static boolean isEmpty(){
        return length == 0;
    }

//    creating a push method for the stack to push the data into stack
    public static void push(int data){
        ListNode temp = new ListNode(data);
//        reference a linked list
//        head.next = newNode
//        newNode = head;
        temp.next = top;
        top = temp;
        length++;
    }


//    creating a pop method to remove data from the stack
    public static int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

//    creating a method to see the data in the stack
    public static int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
}
