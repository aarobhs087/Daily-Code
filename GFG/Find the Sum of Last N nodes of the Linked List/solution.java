/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int len=count(head);
        int sum=0;
        for(int i=1;i<=len;i++){
            if(i>len-n){
                sum+=head.data;
            }
            head=head.next;
        }
        return sum;
        
    }
    public int count(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
