class Solution {
    public int nthUglyNumber(int n) {
        int arr[] = new int[n];
        arr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int f2 = 2, f3 = 3, f5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(f2, f3), f5);
            arr[i] = min;
            if (f2 == min)    f2 = 2 * arr[++i2];
            if (f3 == min)    f3 = 3 * arr[++i3];
            if (f5 == min)    f5 = 5 * arr[++i5];
        }
        return arr[n - 1];
    }
}
