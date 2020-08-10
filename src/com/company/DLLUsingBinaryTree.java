package com.company;

class DllNode{
    int val;
    DllNode left;
    DllNode right;

    public DllNode(int val) {
        this.val = val;
        this.left=null;
        this.right=null;
    }
}

public class DLLUsingBinaryTree {


    public DllNode prev=null;

    public void constructDLL(DllNode root,DllNode head){

        if(root==null)
            return ;

        constructDLL(root.left,head);

        if(prev==null){
            head=root;
        }else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;

        constructDLL(root.right,head);

    }


}
