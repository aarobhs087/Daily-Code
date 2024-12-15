class Solution {

    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1){
           return 0;
       }
       for(int i=0;i<n;i++){
           if(i<n-1){
               if(arr[i]<arr[i+1]){
                   continue;
               }
           }
           if(i>0){
               if(arr[i]<arr[i-1]){
                   continue;
               }
           }
           return i;
       }
       return -1;
    }
}
