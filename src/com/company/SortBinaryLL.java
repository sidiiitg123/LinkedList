package com.company;

public class SortBinaryLL {

    public ListNode solve(ListNode A) {
        int  ZeroCount = 0;
        ListNode temp = A, temp2 = A;

        while (temp != null) {
            if (temp.val == 0) {
                ZeroCount++;
            }
            temp = temp.next;
        }
        while (temp2 != null) {
            if (temp2.val == 0 && ZeroCount > 0) {
                ZeroCount--;
            }
            if (temp2.val == 1 && ZeroCount > 0) {
                temp2.val = 0;
                ZeroCount--;
            }
            temp2 = temp2.next;
            if(ZeroCount==0)
                break;

        }
        while(temp2!=null){
            temp2.val=1;
            temp2=temp2.next;
        }
        return A;
    }
}
