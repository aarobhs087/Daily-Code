
// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int nums[]) {
        // code here
         int n=nums.length;
        long suff[]=new long[n];
        long pref[]=new long[n];
        long mul=1;
        for(int i=0;i<n;i++){
            mul*=nums[i];
            pref[i]=mul;
        }
        mul=1;
        for(int i=n-1;i>=0;i--){
            mul*=nums[i];
            suff[i]=mul;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            long x=1;
            if(i>0) x=x*pref[i-1];
            if(i<n-1)   x=x*suff[i+1];
            arr[i]=(int)x;
        }
        return arr;
    }
}
