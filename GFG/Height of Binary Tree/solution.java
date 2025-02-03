// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node root) {
        // code here
        if (root == null) return 0;

        // Initializing a queue to traverse
        // the tree level by level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            int levelSize = q.size();

            // Traverse all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            // Increment height after traversing each level
            depth++;
        }
        return depth - 1;
    }
}
