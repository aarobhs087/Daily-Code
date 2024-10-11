class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int N= arr.length;

        if (N < 2)
            return -1;

        // Find two consecutive elements with maximum
        // sum.
        int res = arr[0] + arr[1];
        for (int i = 1; i < N - 1; i++)
            res = Math.max(res, arr[i] + arr[i + 1]);

        return res;
    }
}
