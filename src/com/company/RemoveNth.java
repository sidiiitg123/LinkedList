package com.company;

public class RemoveNth {

    public ListNode removeNthFromEnd(ListNode A, int B) {

//        int count=0,k=0;
//        ListNode temp=A,p=null;
//
//        while(temp!=null){
//            count++;
//            A=A.next;
//        }
//        int j=count-B+1;
//
//        while(temp!=null && k<j-1){
//            k++;
//            p=temp;
//            temp=temp.next;
//        }
//        p.next=temp.next;
//
//        return A;
        ListNode prev = null;
        ListNode slow = A;
        ListNode fast = A;

        int count = 1;

        while(count <= B && fast != null){
            count++;
            fast = fast.next;
        }

        if(fast == null){
            return A.next;
        }

        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;

        return A;
    }
}
