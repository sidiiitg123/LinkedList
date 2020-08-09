package com.company;

import java.util.List;

public class AlternateSwap {

    public ListNode swapPairs(ListNode A) {
        ListNode current=new ListNode(0);
        current.next=A;
        A=current;
        ListNode first=null,second=null;

        while(current.next!=null && current.next.next!=null){
            first=current.next;
            second=current.next.next;
            current.next=second;
            first.next=second.next;
            second.next=first;
            current=first;
        }
        return A.next;
    }
}
