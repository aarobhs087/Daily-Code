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
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
         while (root != null) {
          
            // If both n1 and n2 are smaller than root,
            // then LCA lies in left
            if (root.data > n1.data && root.data > n2.data)
                root = root.left;

            // If both n1 and n2 are greater than root,
            // then LCA lies in right
            else if (root.data < n1.data && root.data < n2.data)
                root = root.right;

            // Else Ancestor is found
            else
                break;
        }
      
        return root;
    }
}
