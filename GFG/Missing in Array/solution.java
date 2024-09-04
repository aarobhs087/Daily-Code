// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        Set<Integer> s=new HashSet<>();
        for(int i: arr)    s.add(i);
        int i=1;
        while(i++<=n)    if(!s.contains(i-1))    return i-1;
        return 0;
        
    }
}
