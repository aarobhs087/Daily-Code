// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i: arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i: arr){
            int x=mp.get(i);
            if(x%2==1)  return i;
        }
        return -1;
    }
}
