package com.company;

public class InsertionSortList {
    ListNode newnode;

    public ListNode sorted(ListNode head,ListNode newnode){
        ListNode temp=head,p=temp;
        if(newnode==null || temp.val<=newnode.val){
            temp.next=newnode;
            newnode=temp;
        }else{

        }

    }

    public ListNode insertionSortList(ListNode A) {

        if(A==null){
            return null;
        }

        ListNode head=A;
        newnode= new ListNode(0);
        //ListNode curr=newnode;

        while(head!=null){

            sorted(head,newnode);
        }
    }
}
