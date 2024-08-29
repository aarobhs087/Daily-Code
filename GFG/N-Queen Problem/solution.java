// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (n == 1) {
            ArrayList<Integer> solution = new ArrayList<>();
            solution.add(1);
            results.add(solution);
            return results;
        }
        if (n == 2 || n == 3) {
            return results;
        }

        int[] solution = new int[n];
        for (int i = 0; i < n; i++) {
            solution[i] = -1;
        }

        solveNQueensRec(n, solution, 0, results);
        return results;
    }

    private void solveNQueensRec(int n, int[] solution, int row, ArrayList<ArrayList<Integer>> results) {
        if (row == n) {
            ArrayList<Integer> solutionStr = constructSolutionString(solution);
            results.add(solutionStr);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValidMove(row, i, solution)) {
                solution[row] = i;
                solveNQueensRec(n, solution, row + 1, results);
                solution[row] = -1; // Backtrack
            }
        }
    }

    private boolean isValidMove(int proposedRow, int proposedCol, int[] solution) {
        for (int i = 0; i < proposedRow; i++) {
            int oldRow = i;
            int oldCol = solution[i];
            int diagonalOffset = proposedRow - oldRow;

            if (oldCol == proposedCol || oldCol == proposedCol - diagonalOffset
                    || oldCol == proposedCol + diagonalOffset) {
                return false;
            }
        }
        return true;
    }
    private ArrayList<Integer> constructSolutionString(int[] solution) {
        ArrayList<Integer> returnArr = new ArrayList<>();
        for (int i = 0; i < solution.length; i++) {
            returnArr.add(solution[i]+1);
        }
        return returnArr;
    }
}
