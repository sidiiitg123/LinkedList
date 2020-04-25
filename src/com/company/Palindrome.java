package com.company;

public class Palindrome {

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
    public int compare(ListNode A,ListNode slowPtr){

        ListNode temp1=A;
        ListNode temp2=slowPtr;

        if(A== null && slowPtr==null){
            return 0;
        }
        while(A!=null && slowPtr!=null){
            if(A.next!=slowPtr.next){
                return 0;
            }
            A=A.next;
            slowPtr=slowPtr.next;
        }
        return 1;
    }
    public int lPalin(ListNode A) {
        int res=0;

        ListNode slowPtr=A,fasrPtr=A,PrevSlowPtr=A,midNode=null;

        if(A!=null && A.next!=null){
            while(fasrPtr!=null && fasrPtr.next!=null){
                fasrPtr=fasrPtr.next.next;
                PrevSlowPtr=slowPtr;
                slowPtr=slowPtr.next;
            }
            if(fasrPtr!=null){
                midNode=slowPtr;
                slowPtr=slowPtr.next;

            }
            ListNode SecondHalf=slowPtr;
            PrevSlowPtr.next=null;
            SecondHalf=reverseList(SecondHalf);

            res=compare(SecondHalf,A);

            if(midNode!=null){
                PrevSlowPtr=midNode;
                midNode.next=SecondHalf;
            }

        }
        return res;
    }
}
