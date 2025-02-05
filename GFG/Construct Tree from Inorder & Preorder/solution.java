/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    static Node buildTreeRecur(Map<Integer, Integer> mp, int[] preorder, 
                               int[] preIndex, int left, int right) {

        // For empty inorder array, return null
        if (left > right)
            return null;

        int rootVal = preorder[preIndex[0]];
        preIndex[0]++;

        // create the root Node
        Node root = new Node(rootVal);

        // find the index of Root element in the in-order array.
        int index = mp.get(rootVal);

        // Recursively create the left and right subtree.
        root.left = buildTreeRecur(mp, preorder, preIndex, left, index - 1);
        root.right = buildTreeRecur(mp, preorder, preIndex, index + 1, right);

        return root;
    }

    // Function to construct tree from its inorder and preorder traversals
    static Node buildTree(int[] inorder, int[] preorder) {

        // Hash map that stores index of a root element in inorder array
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            mp.put(inorder[i], i);

        int[] preIndex = {0};
        return buildTreeRecur(mp, preorder, preIndex, 0, inorder.length - 1);
    }

}
