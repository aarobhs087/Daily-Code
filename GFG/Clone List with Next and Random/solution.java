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
    // Helper function to recursively clone nodes
     Node cloneHelper(Node node,Map<Node, Node> mp) {
        if (node == null) {
            return null;
        }

        // If the node is already cloned, 
          // return the cloned
        // node
        if (mp.containsKey(node)) {
            return mp.get(node);
        }

        // Create a new node with the same data
        Node newNode = new Node(node.data);
        mp.put(node,newNode);

        // Recursively clone the next and random pointers
        newNode.next = cloneHelper(node.next, mp);
        newNode.random = cloneHelper(node.random, mp);

        return newNode;
    }
    // Function to clone a linked list with next and random pointer.
    Node cloneLinkedList(Node head) {
        // your code here
        Map<Node, Node> mp = new HashMap<>();
        return cloneHelper(head, mp);
    }
}
