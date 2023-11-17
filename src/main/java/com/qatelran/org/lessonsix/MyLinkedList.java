package com.qatelran.org.lessonsix;

public class MyLinkedList {

    private Node head;

    //Time complexity O(1)
    public void add(int data) {
        Node newNode = new Node(data, null);
        if (head == null) { // esli spisok pustoj , to novy element stanet golovoy i vse
            head = newNode;
            return;
        }
        //esli spisok ne pustoj, to newNode stanet golovoy i budet
        //ssylatsja na proshluyu golovu
        newNode.setNext(head);
        head = newNode;
    }

    //Time complexity O(N)
    public void pushToTail(int data) {
        Node newNode = new Node(data, null);
        if (head == null) { // esli spisok pustoj , to novy element stanet golovoy i vse
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public int get(int index) {
        return 0;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            Integer data = current.getData();
            System.out.print(" " + data);
            current = current.getNext();
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }
}
