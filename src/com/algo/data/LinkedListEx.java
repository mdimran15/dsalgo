package com.algo.data;

public class LinkedListEx<E> {
    private Node<E> head;

    public LinkedListEx() {
    }

    public void add(E val) {
        Node<E> node = createNode(val);
        if (head == null) {
            head = node;
        } else {
            Node<E> loc = head;
            while (loc.next != null) {
                loc = loc.next;
            }
            loc.next = node;
        }
    }

    public String display() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> loc = head;
        while (loc != null) {
            sb.append(loc.val);
            sb.append(" , ");
            loc = loc.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public E remove() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            E val = head.val;
            head = null;
            return val;
        }
        Node<E> loc = head;
        while (loc.next.next != null) {
            loc = loc.next;
        }
        E val = loc.next.val;
        loc.next = null;
        return val;
    }

    private Node<E> createNode(E val) {
        Node<E> node = new Node<>(val, null);
        return node;
    }


    private static class Node<E> {
        E val;
        Node<E> next;

        public Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }

}
