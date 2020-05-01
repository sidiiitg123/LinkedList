package com.company;

public class Add2Numbers {

    public ListNode addTwoNumbers(ListNode A,ListNode B){
        ListNode dummy_node= new ListNode(0);
        ListNode l3=dummy_node;
        int carry=0;
        while(A!=null || B!= null){

           int  l1val=(A!=null)?A.val:0;
           int l2val=(B!=null)?B.val:0;
            int sum=l1val+l2val+carry;
            carry=sum/10;
            int last_digit=sum%10;
            ListNode newnode=new ListNode(last_digit);
            l3.next=newnode;

            A=A.next;
            B=B.next;
            l3=l3.next;
        }
        if(carry>0){
            ListNode newnode2=new ListNode(carry);
            l3.next=newnode2;
        }
        return dummy_node.next;
    }
}
