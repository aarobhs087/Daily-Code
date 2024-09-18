# class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String arr[]=str.split("\\.");
        StringBuilder sb=new StringBuilder();
        int i=0, j= arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        for(String s: arr)  
            if(i!=arr.length-1){
                sb.append(s+".");
                i++;
            }
            else{
                sb.append(s);
            }
        return sb.toString();
    }
}
