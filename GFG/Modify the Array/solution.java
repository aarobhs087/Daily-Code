// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0&&arr[i]==arr[i+1]){
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
        }
        for(int i: arr){
            if(i!=0){
                ans.add(i);
            }
        }
        while(ans.size()<arr.length){
            ans.add(0);
        }
        return ans;
    }
}
