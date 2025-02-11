// User function Template for Java

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here
        Node curr = root;
        Node pre;
        int prevValue = Integer.MIN_VALUE;

        while (curr != null) {
            if (curr.left == null) {
              
                // Process curr node
                if (curr.data <= prevValue) {
                  
                    // Not in ascending order
                    return false;
                }
                prevValue = curr.data;
                curr = curr.right;
            } else {
              
                // Find the inorder predecessor of curr
                pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                  
                    // Create a temporary thread to the curr node
                    pre.right = curr;
                    curr = curr.left;
                } else {
                  
                    // Remove the temporary thread
                    pre.right = null;

                    // Process the curr node
                    if (curr.data <= prevValue) {
                      
                        // Not in ascending order
                        return false;
                    }
                    prevValue = curr.data;
                    curr = curr.right;
                }
            }
        }

        return true;
    }
}
