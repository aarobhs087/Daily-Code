// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here
        long ans=Integer.MIN_VALUE;
        long sum=0;
        for(int i: arr){
            sum+=i;
            ans=Math.max(sum,ans);
            if(sum<0)   sum=0;
            
        }
        sum=0;
        for(int i=arr.length-1;i>=0;i--){
            sum+=arr[i];
            ans=Math.max(sum,ans);
            if(sum<0)   sum=0;
            
        }
        return ans;
    }
}
