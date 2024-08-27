class Solution {
    void leftSmaller(int arr[], int n, int SE[]) {

        Stack<Integer> S = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!S.empty() && S.peek() >= arr[i]) {
                S.pop();
            }

            if (!S.empty()) {
                SE[i] = S.peek();
            }

            else {
                SE[i] = 0;
            }

            S.push(arr[i]);
        }
    }

    void reverse(int a[]) {
        int i, k, n = a.length;
        int t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public int findMaxDiff(int[] arr) {

        // code here
        int n = arr.length;

        int[] LS = new int[n];

        leftSmaller(arr, n, LS);

        int[] RRS = new int[n];

        reverse(arr);
        leftSmaller(arr, n, RRS);

        int result = -1;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, Math.abs(LS[i] - RRS[n - 1 - i]));
        }

        return result;
    }
}
