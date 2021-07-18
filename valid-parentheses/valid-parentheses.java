class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1)
            return false;
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
                st.push(ch);
            else if(!st.isEmpty()&&ch==')')
            {
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            }
             else if(!st.isEmpty()&&ch=='}')
            {
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
             else if(!st.isEmpty()&&ch==']')
            {
                if(st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
            else
                return false;
            
        }
        
        return st.size()==0;
        
    }
}