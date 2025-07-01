package com.aparna.DSPractice.linkedlist.programs;

public class deleteDuplicates {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head = node1;
        Node head1 = node1;
        Node fast = head.next;
        Node slow = head;

        while (fast != null && slow != null) {
            while (fast != null && slow.data == fast.data) {
                fast = fast.next;
            }
            slow.next = fast;
            slow = fast;
            if (null != fast) {
                fast = fast.next;
            }

            while (head1 != null) {
                System.out.println(head1.data);
                head1 = head1.next;
            }

        }
    }
}
