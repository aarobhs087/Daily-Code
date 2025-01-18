// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null) return head;
        Node temp=head;
        Node prev=null;
        Node curr=null;
        while(temp.next!=null){
            prev=curr;
            curr=temp;
            temp=temp.next;
            curr.next=prev;
        }
        head=temp;
        temp.next=curr;
        return head;
    }
}
