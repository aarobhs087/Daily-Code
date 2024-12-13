// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int min=arr[0];
        for(int i: arr){
            min=Math.min(min,i);
        }
        return min;
    }
}
