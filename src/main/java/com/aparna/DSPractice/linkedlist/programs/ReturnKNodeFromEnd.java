package com.aparna.DSPractice.linkedlist.programs;

public class ReturnKNodeFromEnd {
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
        node5.next = null;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = null;

        Node head = node1;
        Node fast = head;
        Node slow = head;
        int k =2;
        while(k>0)
        {
            fast = fast.next;
            k--;
        }
        while(fast!= null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
}
