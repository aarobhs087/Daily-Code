/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    void inorderTraversal(Node root, ArrayList<Integer> inorder) {
        if (root == null)
            return;

        inorderTraversal(root.left, inorder);

        // Store the current node's value
        inorder.add(root.data);

        inorderTraversal(root.right, inorder);
    }

    // Function to find if there exists a pair with a 
    // given sum in the BST
    boolean findTarget(Node root, int target) {
      
        // Create an auxiliary array and store Inorder traversal
        ArrayList<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);

        // Use two-pointer technique to find the pair with given sum
        int left = 0, right = inorder.size() - 1;

        while (left < right) {
            int currentSum = inorder.get(left) + inorder.get(right);

            // If the pair is found, return true
            if (currentSum == target)
                return true;

            // If the current sum is less than the target, 
            // move the left pointer
            if (currentSum < target)
                left++;
          
            // If the current sum is greater than 
            // the target, move the right pointer
            else
                right--;
        }

        return false;
    }
}
