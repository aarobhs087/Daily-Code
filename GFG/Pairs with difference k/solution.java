
// User function Template for Java
class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i: arr){
            if(mp.containsKey(i+k))
                count+=mp.get(i+k);
            if(mp.containsKey(i-k))
                count+=mp.get(i-k);
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        return count;
    }
}
