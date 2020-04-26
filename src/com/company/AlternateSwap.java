package com.company;

import java.util.List;

public class AlternateSwap {

    public ListNode swapPairs(ListNode A) {
        ListNode temp=new ListNode(0);
        temp.next=A;
        ListNode current=temp,first=null,second=null;

        while(current.next!=null && current.next.next!=null){
            first=current.next;
            second=current.next.next;
            first.next=second.next;
            current.next=second;
            current.next.next=first;
            current=current.next.next;
        }
        return temp.next;
    }
}
