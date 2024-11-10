// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        int n1=a.length,n2=b.length;
        while(i<n1&&j<n2){
            if(a[i]==b[j]){
                ans.add(a[i]);
                while(i<n1-1&&a[i]==a[i+1]) i++;
                while(j<n2-1&&b[j]==b[j+1]) j++;
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                ans.add(a[i]);
                while(i<n1-1&&a[i]==a[i+1]) i++;
                i++;
            }
            else{
                ans.add(b[j]);
                while(j<n2-1&&b[j]==b[j+1]) j++;
                j++;
            }
        }
        while(i<n1){
            ans.add(a[i]);
            while(i<n1-1&&a[i]==a[i+1]) i++;
            i++;
        }
        while(j<n2){
            ans.add(b[j]);
            while(j<n2-1&&b[j]==b[j+1]) j++;
            j++;
        }
        return ans;
    }
}
