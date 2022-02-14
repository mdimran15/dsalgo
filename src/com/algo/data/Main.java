package com.algo.data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedListEx<Integer> ll = new LinkedListEx();
        ll.add(5);
        ll.add(65);
        ll.add(50);
        ll.add(5);
        ll.add(50);
        ll.add(51);
        ll.add(52);
        ll.add(51);
        System.out.println(ll.display());
        ll.remove();
        System.out.println(ll.display());
        System.out.println(ll.find(51));
    }
}
