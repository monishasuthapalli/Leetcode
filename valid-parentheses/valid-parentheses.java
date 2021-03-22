class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='{'||c=='[')
            {
                stack.push(c);
            }
            else if(c==')'&&stack.isEmpty()==false&&stack.peek()=='(')
                stack.pop();
            else if(c=='}'&&stack.isEmpty()==false&&stack.peek()=='{')
                stack.pop();
            else if(c==']'&&stack.isEmpty()==false&&stack.peek()=='[')
                stack.pop();
            else
                return false;   
        }
        return stack.isEmpty();
        
    }
}