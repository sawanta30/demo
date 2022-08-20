package com.example.demo.dsalg.tree;

import javax.websocket.Decoder;

public class Client {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(5);
        tree.add(8);
        tree.add(9);
        tree.add(1);
        tree.add(2);
        tree.add(11);
        tree.add(6);
        tree.add(7);

        System.out.println(tree.find(9));
        System.out.println(tree.find(11));


    }
}
