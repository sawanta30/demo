package com.example.demo.dsalg.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data){
        Node node = new Node(data);
        if (isEmpty())
            first=last=node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(int data){
        Node node = new Node(data);
        if (isEmpty())
            first = last = node;
        else {
           last.next = node;
           last = node;
        }
        size++;


    }

    public void removeFirst() {
        if (isEmpty())
           return;
        if (first.next == null)
            first=last=null;
        else{
            Node temp = first.next;
            first.next = null;
            first = temp;

        }
        size--;
    }




    public void removeLast(){
        if (isEmpty())
            return;
        if (first.next == null)
            first=last=null;
        else{
            Node prev=null;
            Node start = first;
            while(start.next != null){
                prev = start;
                start=start.next;
            }
            prev.next = null;
            last = prev;

        }
        size--;
    }

    public int size(){
        return size;
    }
    private boolean isEmpty(){
        return first == null;
    }

    public int findKthElementFromEnd(int k){
        if (k<1)
            throw new IllegalArgumentException("K can not be zero");
        if (isEmpty())
            return -1;
        int n = size;
        Node a = first;
        Node b = first;
        for (int i = 0; i< k; i++){
            if (a.next ==null)
                return first.data;
            a=a.next;
        }
        while(a!=null){

//            b = a;
            a=a.next;
            b=b.next;
        }
        return b.data;

    }


}
