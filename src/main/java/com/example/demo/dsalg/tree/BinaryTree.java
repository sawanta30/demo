package com.example.demo.dsalg.tree;

public class BinaryTree {

    private Node root;

    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value ){
            this.value = value;
        }

    }

    public void add(int data){
        if (root == null)
            root = new Node(data);
        else
            lookupAndInsert(data,root);
    }

    private void lookupAndInsert(int data, Node node){
        Node current = node;
        Node insertElement = new Node(data);
        while(true){
            if (data <= current.value){
                if (current.left == null) {
                    current.left = insertElement;
                    break;
                }
                current = current.left;
            }
            else{
                if (current.right == null){
                    current.right = insertElement;
                break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value){
       Node current = root;
       if (current == null)
           return false;
       while(current != null){
           if (value < current.value)
               current = current.left;
           else if (value > current.value)
               current = current.right;
           else
               return true;
       }
       return false;
    }

}
