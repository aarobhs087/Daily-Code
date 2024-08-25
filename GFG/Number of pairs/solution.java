//Back-end complete function Template for Java
class Solution {
     int count(int x, int Y[], int n, int NoOfY[])
    {
    
        if (x == 0)
            return 0;

        if (x == 1)
            return NoOfY[0];

        int idx = Arrays.binarySearch(Y, x);
        int ans;
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = Y.length - idx;
        }
        else {
            while (idx < n && Y[idx] == x) {
                idx++;
            }
            ans = Y.length - idx;
        }

    
        ans += (NoOfY[0] + NoOfY[1]);

       
        if (x == 2)
            ans -= (NoOfY[3] + NoOfY[4]);

    
        if (x == 3)
            ans += NoOfY[2];

        return ans;
    }

   
    public long countPairs(int X[], int Y[], int m, int n)
    {
      
        int NoOfY[] = new int[5];
        for (int i = 0; i < n; i++)
            if (Y[i] < 5)
                NoOfY[Y[i]]++;

     
        Arrays.sort(Y);

        long total_pairs = 0; 

       
        for (int i = 0; i < m; i++)
            total_pairs += count(X[i], Y, n, NoOfY);

        return total_pairs;
    }
}
