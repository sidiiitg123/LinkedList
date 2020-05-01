package com.company;

public class ReverseK {

    public ListNode reverse(ListNode A,int B){
        ListNode current = A;
        ListNode previous = null;
        ListNode next = null;

        int count=B;
        while(count-->0 && current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        if(current!=null){
            A.next=reverse(current, B);
        }

        return previous;
    }
}
