package com.bridgelabz.BinarySearchTree;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void inset(K key){
        insert_recursive(key, root);
    }
    public void insert_recursive(K key, MyBinaryNode currentNode){
        if (root == null){
            root=new MyBinaryNode(key);
            System.out.println(key+" assigned to root");
        } else if (currentNode.left==null && key.compareTo(currentNode.getKey()) <= 0) {
            currentNode.left=new MyBinaryNode(key);
            System.out.println(key+" assigned left to "+currentNode.getKey());
        } else if (key.compareTo(currentNode.getKey()) <= 0) {
            currentNode=currentNode.left;
            insert_recursive(key,currentNode);
        } else if (currentNode.right == null) {
            currentNode.right=new MyBinaryNode(key);
            System.out.println(key+" assigned right to "+currentNode.getKey());
        } else {
            currentNode=currentNode.right;
            insert_recursive(key,currentNode);
        }
    }
    public MyBinaryNode<K> search(K key){
        return search_recursive(key,root);
    }
    public MyBinaryNode<K> search_recursive(K key, MyBinaryNode<K> currentNode){
        if (currentNode.getKey().equals(key)){
            System.out.println("found: "+currentNode.getKey());
            return currentNode;
        } else if (currentNode.getKey().compareTo(key) > 0) {
            currentNode=currentNode.left;
            search_recursive(key,currentNode);
        }else {
            currentNode=currentNode.right;
            search_recursive(key,currentNode);
        }
        return currentNode;
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.inset(56);
        bst.inset(30);
        bst.inset(70);
        bst.inset(22);
        bst.inset(60);
        bst.inset(95);
        bst.inset(40);
        bst.inset(11);
        bst.inset(3);
        bst.inset(16);
        bst.inset(65);
        bst.inset(63);
        bst.inset(67);

        bst.search(63);
    }
}