package com.company;

public class PartitionList {

    public ListNode partition(ListNode A, int B) {

        if (A == null) {
            return null;

        }
        ListNode less=null,lessitr=null,greater=null,greateritr=null,itr=A;

        while(itr!=null){

            if(itr.val<B){
                if(less==null){
                    less=itr;
                    lessitr=less;
                }else{
                    lessitr.next=itr;
                    lessitr=lessitr.next;
                }
            }else if(itr.val>=B){
                if(greater==null){
                    greater=itr;
                    greateritr=greater;
                }else{
                    greateritr.next=itr;
                    greateritr=greateritr.next;
                }
            }
            itr=itr.next;
        }
        if(less!=null){
            lessitr.next=greater;
            greateritr.next=null;
            return less;
        }


        greateritr.next=null
        return greater;
    }
}
