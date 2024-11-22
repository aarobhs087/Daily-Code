// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n=prices.length;
        int max[]=new int[n];
        max[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(max[i+1],prices[i]);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,max[i+1]-prices[i]);
        }
        return ans;
    }
}
