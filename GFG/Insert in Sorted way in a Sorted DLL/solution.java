/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node temp=head;
        Node prev=head;
        while(temp!=null&&temp.data<x){
            prev=temp;
            temp=temp.next;
        }
        Node newNode=new Node(x);
        if(temp==head){
            head.prev=newNode;
            newNode.prev=null;
            newNode.next=head;
            return newNode;
        }
        if(temp==null){
            newNode.next=null;
            newNode.prev=prev;
            prev.next=newNode;
            return head;
        }
        newNode.next=prev.next;
        newNode.prev=prev;
        prev.next.prev=newNode;
        prev.next=newNode;
        return head;
    }
}
