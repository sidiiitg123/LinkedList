package com.company;

public class DoublyLinkedList {
    Node head;

    public class Node {
        int value;
        Node next, previous;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(DoublyLinkedList dl, int value, int position) {

        Node temp = dl.head,p=null;
        Node newNode = new Node(value);
        int k = 0;
        if (dl.head == null) {
            dl.head = newNode;
        } else {
            if (position == 1) {
                newNode.next = temp;
                newNode.previous = null;
                dl.head = newNode;
            } else {
                while (temp != null && k < position - 1) {
                    k++;
                    p = temp;
                    temp = temp.next;
                }
                newNode.next=p.next;
                newNode.previous=p;
                p.next=newNode;
                p.next.previous=newNode;
            }
        }

    }
    public void deleteByPosition(DoublyLinkedList list, int position) {

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
                if(temp.next!=null){
                    p.next=temp.next;
                    temp.next.previous=p;
                }else{
                    p.next=temp.next;
                }
            }
        }

    }
    public void deleteByValue(DoublyLinkedList list, int value) {

        Node temp = list.head, p = temp;
        int k = 0;

        if (temp == null) {
            list.head=null;
        }else{
            while(temp!=null && temp.value!=value){
                p=temp;
                temp=temp.next;
            }
            if(temp.next!=null && temp!=list.head){
                p.next=temp.next;
                temp.next.previous=p;
            }else {
                list.head=list.head.next;
                list.head.previous=null;
            }

        }

    }
    public void display(DoublyLinkedList list){
        Node temp=list.head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
