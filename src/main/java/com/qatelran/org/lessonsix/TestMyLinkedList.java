package com.qatelran.org.lessonsix;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1); // new Node(1, null);
        list.add(3); // new Node(3, null);
        list.add(4); // new Node(4, null);
        list.add(8); // new Node(8, null);

        //8 -> 4 -> 3 -> 1

        list.print();
        System.out.println();

        System.out.println("Size myLinkedList = " + list.size());

        list.add(0);
        list.print();
        System.out.println();
        System.out.println("Size myLinkedList = " + list.size());

        // 0 -> 8 -> 4 -> 3 -> 1

        // 0 -> 8 -> 4 -> 3 -> 1 -> 7
        list.pushToTail(7);
        list.print();
        System.out.println();
        System.out.println("---------------------");

        int element = list.get(3);

        /*
        // Eto proishodit vnutri klassa MyLinkedList
        // eto primer sozdanija LinkedList bez dop klassa, to na ojectah
        // klassa Node

        Node node1 = new Node(1, null);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(4, node2);
        Node head = new Node(8, node3);

        Node current = head;
        while (current != null) {
            Integer data = current.getData();
            System.out.print(" " + data);
            current = current.getNext();
        }
        */

    }
}
