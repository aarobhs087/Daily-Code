class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum=0;
        for(int i: arr) sum+=i;
        int sum2=0;
        for(int i: arr){
            sum2+=i;
            if((sum-sum2)==sum2)    return true;
        }
        return false;
    }
}
