package com.company;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode A) {

        ListNode head = A;
        ListNode temp = A.next;
        ListNode last = A;

        while(temp!=null){
            if(temp.val != last.val){
                last.next = temp;
                last = last.next;
            }
            temp = temp.next;
        }

        last.next = null;
        return head;
    }
}
