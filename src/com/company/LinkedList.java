package com.company;

public class LinkedList {

    Node head;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(LinkedList list, int value, int position) {

        Node newNode = new Node(value);
        newNode.next = null;
        Node temp = list.head, p = null;
        int k = 0;

        if (temp == null) {
            list.head = newNode;
        }else{
            if (position == 1) {
                newNode.next = temp;
                list.head = newNode;
            } else {
                while (temp != null && k < position - 1) {
                    k++;
                    p = temp;
                    temp = temp.next;
                }
                p.next = newNode;
                newNode.next = temp;
            }
        }

    }
    public void deleteByPosition(LinkedList list, int position) {

        Node temp = list.head, p = null;
        int k = 0;

        if (temp == null) {
            list.head=null;
        }else{
            if (position == 1) {
                list.head=list.head.next;
            } else {
                while (temp != null && k < position - 1) {
                    k++;
                    p = temp;
                    temp = temp.next;
                }
                p.next = temp.next;
            }
        }

    }
    public void deleteByValue(LinkedList list, int value) {

        Node temp = list.head, p = temp;
        int k = 0;

        if (temp == null) {
            list.head=null;
        }else{
            while(temp!=null && temp.value!=value){
                p=temp;
                temp=temp.next;
            }
            p=p.next;
        }

    }
    public void display(LinkedList list){
        Node temp=list.head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
