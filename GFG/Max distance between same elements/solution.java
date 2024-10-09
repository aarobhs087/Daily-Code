class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int n=arr.length;
         // Used to store element to first index mapping 
        HashMap<Integer, Integer> map = new HashMap<>(); 
          
        // Traverse elements and find maximum distance between  
        // same occurrences with the help of map.  
        int max_dist = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
            // If this is first occurrence of element, insert its  
            // index in map  
            if (!map.containsKey(arr[i])) 
                map.put(arr[i], i); 
  
            // Else update max distance  
            else
                max_dist = Math.max(max_dist, i - map.get(arr[i])); 
        } 
  
        return max_dist;
    }
}
