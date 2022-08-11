package com.example.demo.core.Interview.morganstanley;

public class SwapKthNode {
    static Node head;
    private static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }


    public static void main(String[] args) {

        int[] dataArr = {1, 3, 6, 9, 10, 2, 7, 34, 12, 11};
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        print(head);
        System.out.println();
//        print(head);
        head = swapKthNode(head,1);
        print(head);
    }

    private static void print(Node head) {
        while(head != null){
            if (head.next == null) {
                System.out.println(head.data);
                break;
            }
            System.out.print(head.data+"->");
            head = head.next;
        }
    }

    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private static Node swapKthNode(Node head, int k) {
        System.out.println("start -> "+head);
        Node x;
        Node y;
        Node prev_x;
        Node prev_y;
        Node temp;
        int length = getLength(head);

        if (k == 0)
            return head;

        if (k > length)
            return head;

        if (k == length-k+1)
            return head;

        //finding x and x_prev
        x = head;
        prev_x = null;
        for (int i = 1; i < k; i++) {
            prev_x = x;
            x = x.next;
        }

        //finding y and prev_y
        y = head;
        prev_y = null;
        for(int i = 1; i < length-k+1; i++){
            prev_y = y;
            y = y.next;
        }

        System.out.println("prev_x : "+prev_x);
        System.out.println("x : "+x);
        System.out.println("prev_y : "+prev_y);
        System.out.println("y : "+y);


        //swap prev_x.next with y
        if (prev_x != null)
            prev_x.next = y;
        //swap prev_y.next with x
        if (prev_y != null)
            prev_y.next = x;

        //swapping next element of both
        temp = x.next;
        x.next = y.next;
        y.next = temp;



        if (k == 1)
            head = y;
        if (k == length)
            head = x;

        System.out.println("end -> "+head);
        return head;
    }
}
