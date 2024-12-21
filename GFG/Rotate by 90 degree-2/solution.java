// User function Template for Java

class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][]) {
        // code here
        int n=matrix.length;
        int arr[][]=new int[n][n];
        int x=0,y=0;
        for(int i=n-1;i>=0;i--){
            y=0;
            for(int j=0;j<n;j++){
                arr[x][y++]=matrix[j][i];
            }
            x++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}
