class Solution {
    public int evaluate(String[] arr) {
        // code here
         Stack<Integer> stack = new Stack<>();

        for (String token : arr) {
            
            // If the token is a number, push it onto the stack
            if (token.matches("-?\\d+")) {  
                stack.push(Integer.parseInt(token));
            } 
            
            // Otherwise, it must be an operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
