package com.company;

public class ReverseLL {

    public ListNode reverseList(ListNode A) {

        ListNode curr=A,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        A=prev;

        return A;
    }
}
