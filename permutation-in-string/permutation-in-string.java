class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character,Integer> map1=new HashMap<>();
        int matched=0;
        for(int i=0;i<s1.length();i++)
        {
            char left=s1.charAt(i);
            map1.put(left,map1.getOrDefault(left,0)+1); 
        }
        
        int ws=0;
        for(int we=0;we<s2.length();we++)
        {
            char right=s2.charAt(we);
            if(map1.containsKey(right)){
                map1.put(right,map1.getOrDefault(right,0)-1);
                if(map1.get(right)==0)
                matched++;
            }
            
            if(matched==map1.size())
                return true;
            
            if(we>=s1.length()-1)
            {
                char left=s2.charAt(ws);
                ws++;
                if(map1.containsKey(left))
                {
                    if(map1.get(left)==0)
                    {
                        matched--;
                    }
                    map1.put(left,map1.get(left)+1);
                }
            }
            
            
        }
        
        return false;
        
        
    }
}