/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        while(head!=null&&head.next!=null){
            head.next=head.next.next;
            head=head.next;
        }
        
    }
}
