package com.company;

import java.util.Stack;

public class Subtract {
    public ListNode subtract(ListNode A) {
        if(A==null){
            return null;
        }
        Stack<Integer> mystack= new Stack<>();
        ListNode temp=A;
        int count=0;
        while(temp!=null){
            mystack.push(temp.val);
            temp=temp.next;
            count++;
        }
        temp=A;
        if(count==1){
            return  A;
        }
        for(int i=0;i<count/2;i++){
            temp.val=mystack.pop()-temp.val;
            temp=temp.next;
        }
        return A;
    }
}
