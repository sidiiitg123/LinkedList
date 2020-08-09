package com.company;

public class KthNodeFromMiddle {

    public int solve(ListNode A, int B) {

        ListNode temp = A, temp2 = A;
        int count = 0;
        int ms = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int y = (count / 2) + 1;
        int MoveStep = y - B - 1;
        if (B >= y || MoveStep < 0) {
            return -1;
        }

        while (ms != MoveStep && temp2 != null) {
            temp2 = temp2.next;
            ms++;
        }

        return temp2.val;
    }


}
