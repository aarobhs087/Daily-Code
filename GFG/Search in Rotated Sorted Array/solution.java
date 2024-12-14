// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        // Complete this function
        int n=arr.length;
        int ind=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                ind=i+1;
                break;
            }
        }
        int ans=-1;
        if(ind==-1){
            ans=help(arr,key,0,n-1);
        }
        else{
            if(arr[n-1]>=key){
                ans=help(arr,key,ind,n-1);
            }
            else{
                ans=help(arr,key,0,ind-1);
            }
        }
        return ans;
    }
    int help(int[] arr,int key,int i,int j){
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==key)   return mid;
            else if(arr[mid]>key)   j=mid-1;
            else    i=mid+1;
        }
        return -1;
    }
}
