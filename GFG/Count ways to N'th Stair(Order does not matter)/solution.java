class Solution {
    public long nthStair(int n) {
        // Code here
        long count=1;
        while(n>1){
            if(n>=2){
                count++;
                n-=2;
            }
        }
        return count;
    }
}
