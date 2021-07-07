class Solution {
    public String minWindow(String s, String t) {
        int ws=0;
        int min=Integer.MAX_VALUE;
        int matched=0;
        int mws=0;
        int sStart=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        for(int we=0;we<s.length();we++)
        {
            char right=s.charAt(we);
            
            if(map.containsKey(right))
            {
                map.put(right,map.get(right)-1);
                if(map.get(right)>=0)
                {
                    matched++;
                }
            }
            
            while(matched==t.length())
            {
                if(min>we-ws+1)
                {                
                    min=we-ws+1;
                    sStart=ws;
            
                }
           
                char left=s.charAt(ws);
                ws++;
                if(map.containsKey(left))
                {
               
                if(map.get(left)==0)
                {
                    matched--;
                }
                 map.put(left,map.get(left)+1);
               }
                
            }
            
            
            
        }
        
        return min>s.length()?"":s.substring(sStart,sStart+min);
    }
}