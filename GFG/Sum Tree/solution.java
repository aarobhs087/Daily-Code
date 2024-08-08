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
}
*/
class Solution {
    boolean ans=true;
    void dfs(Node root){
        if(root==null)  return;
        if(!ans)    return;
        dfs(root.left);
        dfs(root.right);
        int sum=0;
        if(root.left==null&&root.right==null)   return;
        if(root.left!=null)    sum+=root.left.data;
        if(root.right!=null)    sum+=root.right.data;
        if(sum==root.data){
            root.data=sum;
            return;
        }
        else{
            root.data=sum;
            ans=false;
            return;
        }
    }
    boolean isSumTree(Node root) {
        // Your code here
        dfs(root);
        return ans;
    }
}
