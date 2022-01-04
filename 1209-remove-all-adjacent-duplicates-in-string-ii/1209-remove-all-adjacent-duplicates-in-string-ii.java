class Solution {
    class Pair{
        int cnt;
        char ch;
        Pair(int cnt,char ch)
        {
            this.cnt=cnt;
            this.ch=ch;
        }
    }
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> counts=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(counts.isEmpty()||s.charAt(i)!=counts.peek().ch)
            {
                counts.push(new Pair(1,s.charAt(i)));
            }
            else
            {
                counts.peek().cnt+=1;
                if(counts.peek().cnt==k)
                {
                    counts.pop();
                }
            }
            
        }
        
        
        StringBuilder sb=new StringBuilder();
        while(!counts.isEmpty())
        {
            Pair p=counts.pop();
            for(int i=0;i<p.cnt;i++)
            {
                sb.append(p.ch);
            }
        }
        
        return sb.reverse().toString();
        
        
    }
}