//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
 
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean ok = true;
        while (!q.isEmpty()) {
            Node it = q.poll();
            if (it == null) {
                if (ok == false) {
                    ok = true;
                }
 
                if (q.size() == 0)
                    break;
 
                else {
                    q.add(null);
                }
            }
            else {
 
                if (ok) {
                    ans.add(it.data);
                    ok = false;
                }
 
                if (it.left != null) {
                    q.add(it.left);
                }
 
                if (it.right != null) {
                    q.add(it.right);
                }
            }
        }
 
        return ans;
    }
}
