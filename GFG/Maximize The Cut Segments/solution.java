//User function Template for Java


class Solution
{

    public int maximizeCuts(int l, int p, int q, int r)
    {
       //Your code here
        int dp[] = new int[l + 1];

        for (int i = 0; i < l + 1; i++)
            dp[i] = -1;

        dp[0] = 0;

        for (int i = 0; i <= l; i++) {

            if (dp[i] == -1)
                continue;

            if (i + p <= l)
                dp[i + p] = Math.max(dp[i + p], dp[i] + 1);

            if (i + q <= l)
                dp[i + q] = Math.max(dp[i + q], dp[i] + 1);

            if (i + r <= l)
                dp[i + r] = Math.max(dp[i + r], dp[i] + 1);
        }

        if (dp[l] == -1) {
            dp[l] = 0;
        }

        return dp[l];
    }
}
