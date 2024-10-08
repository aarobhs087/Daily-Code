// User function Template for Java

/*class Node

class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/
/*Function should return the head of the 2D LL.*/
class Solution {
    static Node constructUtil(int[][] arr, int i, int j) {
      
        // Base case: if we are out of bounds, return null
        if (i >= arr.length || j >= arr[0].length) {
            return null;
        }

        // Create a new Node with the current
        // matrix value
        Node curr = new Node(arr[i][j]);

        // Recursively construct the right
        // and down pointers
        curr.right = constructUtil(arr, i, j + 1);
        curr.down = constructUtil(arr, i + 1, j);

        // Return the constructed Node
        return curr;
    }

    static Node construct(int arr[][]) {
        // Add your code here.
        return constructUtil(arr, 0, 0);
    }
}
