package com.company;

public class ReverseList2 {


    public ListNode reverseBetween(ListNode A, int B, int C) {

        int count = 1;
        ListNode start = A;
        ListNode firstPart = null;

        while(count < B){
            firstPart = start;
            start = start.next;
            count++;
        }

        ListNode current = start;
        ListNode prev = null;
        ListNode next = null;

        while(count<=C){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        start.next = next;
        if(firstPart == null){
            A = prev;
        }
        else{
            firstPart.next = prev;
        }

        return A;
    }
}
