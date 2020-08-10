package com.company;

public class SortLl {

    public ListNode head = null;
    public ListNode tail = null;

    public void addNode(int data) {

        ListNode newNode = new ListNode(data);

        if (head ==null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void sortList() {

        ListNode current = head, index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if (current.val > index.val) {
                        temp = current.val;
                        current.val = index.val;
                        index.val = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

}
