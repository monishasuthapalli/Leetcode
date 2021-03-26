class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> sstack=new Stack<Character>();
        Stack<Character> tstack=new Stack<Character>();
        
        for(char c:S.toCharArray())
        {
            if(c!='#')
                sstack.push(c);
            else if(!sstack.isEmpty())
                sstack.pop();               
        }
        
         for(char c:T.toCharArray())
        {
            if(c!='#')
                tstack.push(c);
            else if(!tstack.isEmpty())
                tstack.pop();               
        }
        
        while(!sstack.isEmpty())
        {
            char curr=sstack.pop();
            if(tstack.isEmpty()||tstack.pop()!=curr)
                return false;
            
        }
        
        return sstack.isEmpty()&&tstack.isEmpty();
        
        
        
    }
}