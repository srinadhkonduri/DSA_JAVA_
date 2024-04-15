package com.dev.lpa;
// in priority heap we always consider the first block as empty
public class Implementing_MaxHeap {
    public static void main(String[] args) {
        Implementing_MaxHeap pq = new
                Implementing_MaxHeap(3);
        System.out.println(pq.size()); // 0
        System.out.println(pq.isEmpty()); // true
        pq.insert(4);
        pq.insert(5);
        pq.insert(6);
        pq.insert(1);
        pq.insert(2);
        pq.insert(3);
        System.out.println(pq.size());
        pq.printMaxHeap();
    }
    static Integer[] heap;
    static int n;

    public Implementing_MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }
    public static boolean isEmpty(){
        return n == 0;
    }
    public static int size(){
        return n;
    }

//    creating a method that creates the bottom up re heap method
    public static void insert(int x){
        if (n == heap.length - 1){
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;

    }
    private static void resize(int capacity){
        Integer [] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
//    creating an inter changing method
    private static void swim(int k){
        while (k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }

//    creating a method to print the heap array
    public static void printMaxHeap(){
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
