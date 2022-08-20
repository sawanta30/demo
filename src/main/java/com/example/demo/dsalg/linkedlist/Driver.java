package com.example.demo.dsalg.linkedlist;

public class Driver {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(10);
        ll.addLast(15);
        ll.addFirst(5);
        ll.addLast(20);

        int result = ll.findKthElementFromEnd(0);
        System.out.println(result);
    }
}
