/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
class Node {
    int data;
    Node next, random;

    Node(int d)
    {
        data = d;
        next = random = null;

    }
}*/

class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        Map<Node, Node> mp = new HashMap<>();
        Node curr = head;
  
        // Traverse original linked list to store new nodes 
          // corresponding to original linked list
        while (curr != null) {
            mp.put(curr, new Node(curr.data));
            curr = curr.next;
        }
    
        curr = head;
    
        // Loop to update the next and random pointers
          // of new nodes 
        while (curr != null) {
        
            // Update the next pointer of new node
            Node newNode = mp.get(curr);
            newNode.next = mp.get(curr.next);
      
            // Update the random pointer of new node
            newNode.random = mp.get(curr.random);
      
            curr = curr.next;
        }
  
        // Return the head of the clone
        return mp.get(head);
    }
}
