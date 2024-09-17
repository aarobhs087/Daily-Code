class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack=new Stack<>();
        for(char c: x.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                if(c==')'){
                    if(stack.peek()!='(')  return false;
                    stack.pop();
                }
                else if(c=='}'){
                    if(stack.peek()!='{')  return false;
                    stack.pop();
                }
                else{
                    if(stack.peek()!='[')  return false;
                    stack.pop();
                }
            }
        }
       if(!stack.isEmpty()) return false;
       return true;
    }
}
