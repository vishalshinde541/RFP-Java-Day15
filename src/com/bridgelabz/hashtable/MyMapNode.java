package com.bridgelabz.hashtable;

public class MyMapNode<K,V> implements INode<K> {
    K key;
    V value;
    MyMapNode next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K,V> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode) next;
    }
}