package com.qatelran.org.lessonsix;

public class MyLinkedList {

    private Node head;

    //Time complexity O(1)
    public void add(int data) {
        Node newNode = new Node(data, null);
        if( head == null) { // esli spisok pustoj , to novy element stanet golovoy i vse

            head = newNode;
            return;
        }
        //esli spisok ne pustoj, to newNode stanet golovoy i budet
        //ssylatsja na proshluyu golovu
        newNode.setNext(head);
        head = newNode;
    }

}
