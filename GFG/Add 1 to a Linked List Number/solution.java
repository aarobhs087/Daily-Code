/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    Node addOneUtil(Node head)
    {
        Node res = head;
        Node temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null) 
        {

            sum = carry + head.data;

            carry = (sum >= 10) ? 1 : 0;
 
            sum = sum % 10;
 
            head.data = sum;

            temp = head;
            head = head.next;
        }
        if (carry > 0)
            temp.next = new Node(carry);
        return res;
    }
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        head = addOneUtil(head);
        return reverse(head);
    }
}
