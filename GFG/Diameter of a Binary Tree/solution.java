/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    // Recursive function which finds the 
    // height of root and also calculates 
    // the diameter of the tree.
     int diameterRecur(Node root, int[] res) {

        // Base case: tree is empty
        if (root == null)
            return 0;

        // find the height of left and right subtree
        // (it will also find of diameter for left 
        // and right subtree).
        int lHeight = diameterRecur(root.left, res);
        int rHeight = diameterRecur(root.right, res);

        // Check if diameter of root is greater
        // than res.
        res[0] = Math.max(res[0], lHeight + rHeight);

        // return the height of current subtree.
        return 1 + Math.max(lHeight, rHeight);
    }

    // Function to get diameter of a binary tree
     int diameter(Node root) {
        int[] res = new int[1];
        diameterRecur(root, res);
        return res[0];
    }

}
