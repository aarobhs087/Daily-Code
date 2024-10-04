/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        if (head == null || head.next == head) {
            return head; // Empty list or single node
        }

        Node prev = null;
        Node curr = head;
        Node next = null;
        Node tail = head;

        // Traverse the list until we return to the head
        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while (curr != head);

        // The original head's next should point to the new head (prev)
        tail.next = prev;
        head = prev;

        return head;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
         if (head == null) {
            return null; // List is empty
        }

        Node curr = head, prev = null;

        // Handle the case where the node to be deleted is the head
        if (head.data == key) {
            // If there's only one node in the list
            if (head.next == head) {
                return null; // After deletion, the list becomes empty
            }

            // Find the last node (tail) and connect it to the new head
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }

            head = head.next; // Move head to the next node
            tail.next = head; // Adjust tail to point to new head
            return head;
        }

        // Traverse the list to find the node to delete
        do {
            prev = curr;
            curr = curr.next;

            if (curr.data == key) {
                prev.next = curr.next; // Skip the node to delete
                return head; // Return the modified list
            }
        } while (curr != head);

        // If no node with the given key was found, return the unmodified list
        return head;
    }
}
