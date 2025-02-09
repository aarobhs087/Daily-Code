/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
     int maxPathSumUtil(Node root, int[] res) {
        // Base case: return 0 for a null node
        if (root == null) return 0;

        // Calculate maximum path sums for left and right subtrees
        int l = Math.max(0, maxPathSumUtil(root.left, res));
        int r = Math.max(0, maxPathSumUtil(root.right, res));

        // Update 'res' with the maximum path sum passing through the current node
        res[0] = Math.max(res[0], l + r + root.data);

        // Return the maximum path sum rooted at this node
        return root.data + Math.max(l, r);
    }

   
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node root) {
        // your code goes here
        int[] res = {root.data};

        // Compute maximum path sum and store it in 'res'
        maxPathSumUtil(root, res);

        return res[0];
    }
}
