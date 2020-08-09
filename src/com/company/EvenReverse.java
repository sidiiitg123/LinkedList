package com.company;

import java.util.Stack;

public class EvenReverse {
    public ListNode solve(ListNode A) {

        ListNode temp=A,temp2=A;
        int count=1;
        Stack<Integer> myStack= new Stack<>();

        while(temp!=null){
            if(count%2==0)
                 myStack.push(temp.val);
            count++;
            temp=temp.next;
        }
        count=1;
        while(temp2!=null){
            if(count%2==0)
                temp2.val=myStack.pop();
            count++;
            temp2=temp2.next;
        }
        return A;
    }
}
