package com.company;

import java.util.List;

public class ListCycle {

    public ListNode detectCycle(ListNode a) {

        ListNode slow=a,fast=a;

        while(fast!=null && fast.next!=null){
            fast=fast.next;
            if(fast.next!=null ){
                fast=fast.next;
                slow=slow.next;
            }
            if(slow==fast){
                break;
            }
        }
        if(slow==fast) {
            slow = a;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        return null;
    }
}
