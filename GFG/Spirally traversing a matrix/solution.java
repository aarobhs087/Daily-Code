
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        // code here
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int i=0,j=0;
        int n=matrix.length,m=matrix[0].length;
        boolean arr[][]=new boolean[n][m];
        ArrayList<Integer> ans=new ArrayList<>();
        int k=0,x=0;
        while(k<m*n){
            ans.add(matrix[i][j]);
            arr[i][j]=true;
            i+=dir[x][0];
            j+=dir[x][1];
            if(i<0||j<0||i>=n||j>=m||arr[i][j]){
                i-=dir[x][0];
                j-=dir[x][1];
                x=(x+1)%4;
                i+=dir[x][0];
                j+=dir[x][1];
            }
            k++;
        }
        return ans;
        
    }
}
