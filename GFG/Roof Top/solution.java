class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int ans=0;
        int count=0;
        int i=0;
        while(i<arr.length-1){
            if(arr[i+1]>arr[i]){
                count++;
                ans=Math.max(ans, count);
            } else    count=0;
            i++;
        }
        return ans;
    }
}
