package com.example.demo.dsalg.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue {

    public static void main(String[] args) {
        Queue<Integer> queue =new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        reverseQueue(queue);
        System.out.println(queue);
    }

    public  static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.add(queue.poll());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
