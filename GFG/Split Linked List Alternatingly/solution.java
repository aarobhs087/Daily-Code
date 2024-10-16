// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node first=new Node(-1);
        Node second=new Node(-1);
        Node t1=first, t2=second;
        while(head!=null){
            first.next=new Node(head.data);
            first=first.next;
            head=head.next;
            if(head!=null){
                second.next=new Node(head.data);
                second=second.next;
                head=head.next;
            }
        }
        return new Node[]{t1.next,t2.next};
    }
}
