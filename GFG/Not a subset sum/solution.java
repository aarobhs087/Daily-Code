class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long res = 1;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] > res)
            return res;
          else
            res+=arr[i];
        }
        return res;
    }
}
