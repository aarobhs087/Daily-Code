// User function Template for Java
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge two sorted lists.
     Node mergeTwo(Node head1, Node head2) {

        // Create a dummy node to simplify 
        // the merging process
        Node dummy = new Node(-1);
        Node curr = dummy;

        // Iterate through both linked lists
        while (head1 != null && head2 != null) {

            // Add the smaller node to the merged list
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        // If any list is left, append it to
        // the merged list
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }

        // Return the merged list starting
        // from the next of dummy node
        return dummy.next;
    }

     Node mergeListsRecur(int i, int j, List<Node> arr) {

        // If single list is left
        if (i == j) return arr.get(i);

        // Find the middle of lists
        int mid = i + (j - i) / 2;

        // Merge lists from i to mid 
        Node head1 = mergeListsRecur(i, mid, arr);

        // Merge lists from mid+1 to j 
        Node head2 = mergeListsRecur(mid + 1, j, arr);

        // Merge the above 2 lists 
        Node head = mergeTwo(head1, head2);

        return head;
    }

    // Function to merge K sorted linked lists
     Node mergeKLists(List<Node> arr) {

        // Base case for 0 lists 
        if (arr.size() == 0) return null;

        return mergeListsRecur(0, arr.size() - 1, arr);
    }
}
