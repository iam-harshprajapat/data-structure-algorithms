package com.algorithms.dsa.util;

public class Queue<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
    }

    private Node<T> start;
    private Node<T> end;
    private int size = 0;

    public boolean add(T data) {
        Node<T> node = new Node<>();
        node.data = data;

        if (this.start == null && this.end == null) {
            this.start = node;
            this.end = node;
        } else {
            this.end.next = node;
            this.end = node;
        }
        this.size++;
        return true;
    }

    public T remove() {
        T data = this.start.data;
        if (this.start == this.end) {
            this.start = null;
            this.end = null;
        } else {
            this.start = this.start.next;
        }
        this.size--;
        return data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
