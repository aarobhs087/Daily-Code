class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int count=0;
        for(int i: arr){
            int x=i/k;
            if(i%k!=0)  x++;
            count+=x;
        }
        return count;
    }
}
