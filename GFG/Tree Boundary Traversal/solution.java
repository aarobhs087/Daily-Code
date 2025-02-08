// User function Template for Java
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
     boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
    
      // Function to collect the left boundary nodes
    void collectBoundaryLeft(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;

        Node curr = root;
        while (!isLeaf(curr)) {
            res.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    // Function to collect the leaf nodes using Morris Traversal
    void collectLeaves(Node root, ArrayList<Integer> res) {
        Node current = root;

        while (current != null) {
            if (current.left == null) {
              
                // If it's a leaf node
                if (current.right == null) 
                    res.add(current.data);

                current = current.right;
            } 
              else {
              
                // Find the inorder predecessor
                Node predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } 
                  else {
                      // If it's predecessor is a leaf node
                    if (predecessor.left == null) 
                        res.add(predecessor.data);
                    
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
    }


    // Function to collect the right boundary nodes
  void collectBoundaryRight(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;

        Node curr = root;
        ArrayList<Integer> temp = new ArrayList<>();
        while (!isLeaf(curr)) {
            temp.add(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        for (int i = temp.size() - 1; i >= 0; --i)
            res.add(temp.get(i));
    }

    // Function to perform boundary traversal
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        // Add root data if it's not a leaf
        if (!isLeaf(root))
            res.add(root.data);

        // Collect left boundary
        collectBoundaryLeft(root.left, res);

        // Collect leaf nodes
        collectLeaves(root, res);

        // Collect right boundary
        collectBoundaryRight(root.right, res);

        return res;
    }
}
