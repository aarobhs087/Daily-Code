/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node last = head; 
        Node temp = head; 
        if (head == null || k == 0)    return head; 
        while (last.next != null)    last = last.next; 
        while (k != 0) { 
            head = head.next;
            temp.next = null; 
            last.next = temp; 
            last = temp; 
            temp = head; 
            k--; 
        } 
        return head;
    }
}
