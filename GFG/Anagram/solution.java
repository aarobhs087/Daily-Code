class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String a, String b) {

        // Your code here
        int arr[]=new int[26];
        for(char c: a.toCharArray()) {
            arr[c-'a']++;
        }
        for(char c: b.toCharArray()) {
            arr[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
