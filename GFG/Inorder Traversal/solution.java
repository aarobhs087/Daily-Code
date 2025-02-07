/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans=new ArrayList<>();
        help(root,ans);
        return ans;
    }
    public void help(Node root,ArrayList<Integer> ans){
        if(root==null)  return;
        help(root.left,ans);
        ans.add(root.data);
        help(root.right,ans);
    }
}
