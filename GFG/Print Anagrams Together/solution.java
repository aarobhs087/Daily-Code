class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
            // Find the key by sorting the string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            s = new String(chars);
            
            // If key is not present in the hash map, add
            // an empty group (ArrayList) in the result and
            // store the index of the group in hash map
            if (!mp.containsKey(s)) {
                mp.put(s, res.size());
                res.add(new ArrayList<>());
            }
            
            // Insert the string in its correct group
            res.get(mp.get(s)).add(arr[i]);
        }
        
        return res;
    }
}
