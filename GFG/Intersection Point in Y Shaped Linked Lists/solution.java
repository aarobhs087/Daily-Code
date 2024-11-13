/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code her
        Set<Node> s=new HashSet<>();
        while(head1!=null){
            s.add(head1);
            head1=head1.next;
        }
        while(head2!=null){
            if(s.contains(head2)){
                return head2.data;
            }
            head2=head2.next;
        }
        return -1;
    }
}
