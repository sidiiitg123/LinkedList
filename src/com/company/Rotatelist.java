package com.company;

public class Rotatelist {

    public ListNode rotateRight(ListNode A, int B) {
        int l = 0;
        ListNode slow = A;
        ListNode fast = A;
        ListNode temp = A;
        int count = 0;

        while(temp!=null){
            l++;
            temp = temp.next;
        }

        B = B%l;
        if(B == 0){
            return A;
        }
        while(count<B){
            fast = fast.next;
            count++;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode head = slow.next;
        fast.next = A;
        slow.next = null;

        return head;
    }
}
