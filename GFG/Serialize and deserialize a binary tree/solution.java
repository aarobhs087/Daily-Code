/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
    // Main function to serialize a tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            // If curr node is null,
            // append -1 to result.
            if (curr == null) {
                arr.add(-1);
                continue;
            }

            // else push its value into
            // result and push left and right
            // child nodes into queue.
            arr.add(curr.data);
            q.add(curr.left);
            q.add(curr.right);
        }

        return arr;
    }

    // Main function to deserialize a tree.
    public Node deSerialize(ArrayList<Integer> arr) {

        // base case
        if (arr.get(0) == -1) return null;

        // create root node and push 
        // it into queue
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty()) {
            Node curr = q.poll();

            // If left node is not null
            if (arr.get(i) != -1) {
                Node left = new Node(arr.get(i));
                curr.left = left;
                q.add(left);
            }
            i++;

            // If right node is not null
            if (arr.get(i) != -1) {
                Node right = new Node(arr.get(i));
                curr.right = right;
                q.add(right);
            }
            i++;
        }

        return root;
    }
};
