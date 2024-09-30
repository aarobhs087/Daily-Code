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
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> l1=new ArrayList<>();
        help(root1, l1);
        List<Integer> l2=new ArrayList<>();
        help(root2, l2);
        List<Integer> l3=new ArrayList<>();
        int i=0, j=0;
        while(i<l1.size()&&j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                l3.add(l1.get(i++));
            }
            else{
                l3.add(l2.get(j++));
            }
        }
        while(i<l1.size()){
            l3.add(l1.get(i++));
        }
        while(j<l2.size()){
            l3.add(l2.get(j++));
        }
        return l3;
    }
    public void help(Node root, List<Integer> l){
        if(root==null)  return;
        
        help(root.left,l);
        l.add(root.data);
        help(root.right,l);
    }
}
