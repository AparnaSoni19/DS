package com.aparna.DSPractice.linkedlist.programs;

import java.util.HashSet;
import java.util.Set;

public class DeterMineLinkListHasCycleUsingHashSet {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node3;

        Node head = node1;
        Set<Node> set = new HashSet<>();
        boolean circular = false;
        while (head != null) {
            if (set.contains(head)) {
                circular = true;
                break;
            }
            set.add(head);
            head = head.next;
        }
        if (circular == true) {
            System.out.println("It is circular linked list");
        } else {
            System.out.println("It is not circular linked list");
        }
    }

}
