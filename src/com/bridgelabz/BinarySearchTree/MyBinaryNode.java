package com.bridgelabz.BinarySearchTree;

public class MyBinaryNode<K extends Comparable> {
    private K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;
    MyBinaryNode<K> p;

    public MyBinaryNode(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}