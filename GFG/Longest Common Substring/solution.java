// User function Template for Java

class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        int n1=arr1.length;
        int n2=arr2.length;
        int max=Integer.MIN_VALUE;
        int dp[][]=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
