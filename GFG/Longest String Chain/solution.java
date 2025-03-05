class Solution {
    public int longestStringChain(String words[]) {
        // code here
        // Sort words by length
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        // HashMap to store the maximum chain length for each word
        HashMap<String, Integer> dp = new HashMap<>();
        
        int res = 1;
        
        // Iterate through each word in the sorted array
        for (String w : words) {
            dp.put(w, 1); // Initialize length for current word
            
            // Try removing one character at a time
            for (int i = 0; i < w.length(); i++) {
                String pred = w.substring(0, i) + w.substring(i + 1);
                if (dp.containsKey(pred)) {
                    dp.put(w, Math.max(dp.get(w), dp.get(pred) + 1));
                }
            }
            
            res = Math.max(res, dp.get(w));
        }
        
        return res;
    }
}
