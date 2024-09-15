//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    Node head;
    
    // Initialize previously visited node as NULL.
    Node prev = null;
    
    // Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
        // Base case
        if (root == null) {
            return null;
        }
        
        // Recursively convert left subtree
        bToDLL(root.left);
        
        // Now convert this node
        if (prev == null) {
            // First node in DLL will be the head
            head = root;
        } else {
            // Adjust the pointers
            root.left = prev;
            prev.right = root;
        }
        
        // Mark this node as the previous node before moving to the right subtree
        prev = root;
        
        // Recursively convert right subtree
        bToDLL(root.right);
        
        // Return the head of the created DLL
        return head;
    }
}
