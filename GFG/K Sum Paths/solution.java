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
     // Function to find paths in the tree which have their sum equal to K
    int countPathsUtil(Node node, int k, int currSum, 
                                  HashMap<Integer, Integer> prefSums) {
        if (node == null)
            return 0;

        int pathCount = 0;
        currSum += node.data;

        // Pathsum from root to current node is equal to k
        if (currSum == k)
            pathCount++;

        // The count of curr_sum − k gives the number of paths 
        // with sum k up to the current node
        pathCount += prefSums.getOrDefault(currSum - k, 0);

        // Add the current sum into the hashmap
        prefSums.put(currSum, prefSums.getOrDefault(currSum, 0) + 1);

        pathCount += countPathsUtil(node.left, k, currSum, prefSums);
        pathCount += countPathsUtil(node.right, k, currSum, prefSums);

        // Remove the current sum from the hashmap
        prefSums.put(currSum, prefSums.get(currSum) - 1);

        return pathCount;
    }
    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer, Integer> prefSums = new HashMap<>();
      
        return countPathsUtil(root, k, 0, prefSums);
    }
}
