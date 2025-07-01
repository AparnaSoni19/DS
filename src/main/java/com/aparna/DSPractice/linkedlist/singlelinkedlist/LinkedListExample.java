package com.aparna.DSPractice.linkedlist.singlelinkedlist;

public class LinkedListExample {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next= node2;
        node2.next= node3;
        Node head = node1;
        int sum = 0;
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
        while(head!= null) {
            sum = sum + head.data;
            head = head.next;
        }
        System.out.println(sum);
    }

}
