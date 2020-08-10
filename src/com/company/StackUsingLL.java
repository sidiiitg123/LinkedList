package com.company;

public class StackUsingLL {

    ListNode head = null;

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public ListNode pop() {

        ListNode temp;
        if (head == null) {
            return null;
        } else {
            temp = head;
            head = head.next;
            temp.next = null;
        }
        return temp;
    }
}
