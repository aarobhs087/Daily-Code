
// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count=0, max=0;
        for(int i: height){
            if(i>max)   count++;
            max=Math.max(max,i);
        }
        return count;
    }
}
