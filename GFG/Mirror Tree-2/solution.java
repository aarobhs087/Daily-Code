// User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        // Your code here\
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Traverse the tree, level by level
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            // Swap the left and right subtree
            Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            // Push the left and right node to the queue
            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
    
    }
}
