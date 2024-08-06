// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] arr=str.split("\\.");
        if(arr.length!=4)   return false;
        for(String s: arr){
            int x=Integer.parseInt(s);
            if(x<0||x>255)  return false;
        }
        return true;
    }
}
