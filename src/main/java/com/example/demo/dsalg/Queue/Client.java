package com.example.demo.dsalg.Queue;

public class Client {
    public static void main(String[] args) {
        QueueWithStack qws = new QueueWithStack();
        qws.add(10);
        qws.add(20);
        qws.add(30);
        qws.add(40);
        qws.add(50);

        System.out.println(qws.remove());

    }
}
