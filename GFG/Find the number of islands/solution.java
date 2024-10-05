class Solution {
     void DFS(char[][] M, int r, int c) {
        int ROW = M.length;
        int COL = M[0].length;

        // Base condition
        // if r or c is out of bounds or M[r][c] is not '1'
        if (r < 0 || c < 0 || r >= ROW || c >= COL || M[r][c] != '1') {
            return;
        }

        // Mark the cell as visited by setting it to '0'
        M[r][c] = '0';

        // Traverse all 8 possible directions
        int[] rNbr = {1, -1, 0, 0, 1, -1, 1, -1};
        int[] cNbr = {0, 0, 1, -1, 1, -1, -1, 1};

        for (int i = 0; i < 8; ++i) {
            int newR = r + rNbr[i];
            int newC = c + cNbr[i];
            DFS(M, newR, newC);
        }
    }
    // Function to find the number of islands.
    public int numIslands(char[][] M) {
        // Code here
        int ROW = M.length;
        int COL = M[0].length;
        int count = 0;

        // Traverse the entire matrix
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {

                // If a cell with value '1' is found
                if (M[r][c] == '1') {

                    // Increment the island count
                    count++;

                    // Start DFS from the current cell
                    DFS(M, r, c);
                }
            }
        }
        return count;
    }
}
