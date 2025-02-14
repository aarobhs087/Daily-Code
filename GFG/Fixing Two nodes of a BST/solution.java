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
    void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }



    // Recursive Function for inorder traversal to find out 
    // the two swapped nodes.
    void correctBSTUtil(Node root, Node[] first, Node[] middle, 
                                Node[] last, Node[] prev) {
        if (root == null)
            return;

        // Recur for the left subtree
        correctBSTUtil(root.left, first, middle, last, prev);

        // If this node is smaller than the previous node, 
        // it's violating the BST rule.
        if (prev[0] != null && root.data < prev[0].data) {

            // If this is the first violation, mark these 
            // two nodes as 'first' and 'middle'
            if (first[0] == null) {
                first[0] = prev[0];
                middle[0] = root;
            }

            // If this is the second violation, 
            // mark this node as last
            else
                last[0] = root;
        }

        // Mark this node as previous
        prev[0] = root;

        // Recur for the right subtree
        correctBSTUtil(root.right, first, middle, last, prev);
    }

    // Function to fix the given BST, where two nodes are swapped.
    void correctBST(Node root) {
        // Initialize pointers needed for correctBSTUtil()
        Node[] first = {null}, middle = {null}, 
               last = {null}, prev = {null};

        // Set the pointers to find out two nodes
        correctBSTUtil(root, first, middle, last, prev);

        // Fix (or correct) the tree
        if (first[0] != null && last[0] != null)
            swap(first[0], last[0]);
        else if (first[0] != null && middle[0] != null)
            swap(first[0], middle[0]);
    }

}
