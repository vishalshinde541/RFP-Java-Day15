package com.bridgelabz.hashtable;

public class LinkedList<K, V> {
    MyMapNode head;
    MyMapNode tail;

    public void append(MyMapNode<K, V> node){
        if (head == null){
            head= (MyMapNode) node;
        } else {
            tail.setNext(node);
        }
        tail = (MyMapNode) node;
    }
    public MyMapNode search(K key){
        if (head == null) {
            return null;
        }
        else {
            MyMapNode node=head;
            while (!node.getKey().equals(key)){
                if (node==tail && !node.getKey().equals(key)){
                    return null;
                }
                node=node.getNext();
            }
            return node;
        }

    }

    public MyMapNode remove(K key){
        MyMapNode deleteNode=search(key);
        MyMapNode previousNode=head;
        if (deleteNode != null){
            while (!previousNode.getNext().equals(deleteNode)){
                previousNode=previousNode.getNext();
            }
            previousNode.setNext(deleteNode.getNext());
            return deleteNode;
        }else {
            return null;
        }
    }

    public void print(){
        if (head == null){
            System.out.println("null");
        }else {
            MyMapNode myMapNode=head;
            System.out.print("{ ");
            while (!(myMapNode == null)){
                System.out.print(myMapNode.getKey()+"="+myMapNode.getValue()+", ");
                myMapNode=myMapNode.getNext();
            }
            System.out.println("}");
        }
    }
}