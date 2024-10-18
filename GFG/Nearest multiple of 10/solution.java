// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function
        char arr[]=str.toCharArray();
        int n=arr.length;
        char c=arr[n-1];
        int x=c-'0';
        if(x<=5){
            arr[n-1]='0';
            return new String(arr);
        }
        else{
            if(n==1)    return "10";
            else{
                arr[n-1]='0';
                while(n-2>=0&&arr[n-2]=='9'){
                    arr[n-2]='0';
                    n--;
                }
                if(n-2<0){
                    StringBuilder sb=new StringBuilder();
                    sb.append('1');
                    for(char c1: arr){
                        sb.append(c1);
                    }
                    return sb.toString();
                }
                arr[n-2]=(char)(arr[n-2]+1);
                return new String(arr);
            }
        }
    }
}
