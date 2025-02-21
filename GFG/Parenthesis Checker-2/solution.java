class Solution {
    static boolean isBalanced(String s) {
        // code here
        // Declare a stack to store the opening brackets
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
          
            // Check if the character is an opening bracket
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i)); 
            } 
            else {
              
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if (!st.empty() && 
                    ((st.peek() == '(' && s.charAt(i) == ')') ||
                     (st.peek() == '{' && s.charAt(i) == '}') ||
                     (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop(); 
                }
                else {
                  
                    // Unmatched closing bracket
                    return false; 
                }
            }
        }
      
        // If stack is empty, return true (balanced), 
        // otherwise false
        return st.empty();
    }
}
