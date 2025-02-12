// User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int cnt = 0;
        Node curr = root;
        
        while (curr != null) {
            
            // if left child is null, check 
            // curr node and move to right node.
            if (curr.left == null) {
                cnt++;
                
                // If curr is kth smallest node 
                if (cnt == k) return curr.data;
                
                curr = curr.right;
            } else {
              
                // Find the inorder predecessor of curr
                Node pre = curr.left;
                while (pre.right != null && pre.right != curr)
                    pre = pre.right;

                // Make curr as the right child of its
                // inorder predecessor and move to 
                // left node.
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                  
                    // Revert the changes made in the 'if' part to
                    // restore the original tree i.e., fix the right
                    // child of predecessor
                    pre.right = null;
                    
                    cnt++;
                    if (cnt == k) return curr.data;
                    
                    curr = curr.right;
                }
            }
        }
        
        // If k is greater than size of 
        // BST, return -1.
        return -1;
    }
}
