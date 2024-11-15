// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int i=arr.length-1;
        while(i>0){
            if(arr[i]!=arr[i-1])    return arr[i-1];
            i--;
        }
        return -1;
    }
}
