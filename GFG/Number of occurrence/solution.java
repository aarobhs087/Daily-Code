class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int x=target;
        boolean flag=false;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
                flag=true;
            }
            else if(flag){
                break;
            }
        }
        return count;
    }
}
