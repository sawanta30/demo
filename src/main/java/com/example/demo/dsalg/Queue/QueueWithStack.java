package com.example.demo.dsalg.Queue;

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> adder = new Stack<>();
    private Stack<Integer> remover = new Stack<>();

    public void add(int data){
        adder.push(data);

    }

    public int remove(){
       if (adder.isEmpty() && remover.isEmpty())
           throw new IllegalArgumentException("Queue is empty");
       else{
           while (!adder.isEmpty()){
               remover.push(adder.pop());
           }
           return remover.pop();
       }

    }


}
