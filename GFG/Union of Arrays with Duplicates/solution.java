// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++)  s.add(a[i]);
        for(int j=0;j<b.length;j++)  s.add(b[j]);
        return s.size();
    }
}
