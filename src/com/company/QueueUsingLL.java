package com.company;

import java.util.List;

public class QueueUsingLL {
    ListNode front,rear;

    public QueueUsingLL() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int val){
        ListNode newNode = new ListNode(val);
        if (this.rear == null){
            this.front=newNode;
            this.rear=newNode;
            return;
        }
        this.rear.next=newNode;
        this.rear=newNode;

    }

    public ListNode deQueue() {

        ListNode temp;
        if (this.front == null) {
            return null;
        }
        temp=this.front;
        this.front=this.front.next;
        temp.next=null;

        if(this.front==null){
         this.rear=null;
        }
        return temp;
    }
}
