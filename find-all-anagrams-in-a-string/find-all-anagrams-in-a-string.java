class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int ws=0;
        List<Integer> anags=new ArrayList<Integer>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int matched=0;
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
          
            char right=s.charAt(windowEnd);
            if(map.containsKey(right))
            {
                map.put(right,map.get(right)-1);
                if(map.get(right)==0)
                matched++;
            }
            
            if(matched==map.size())
            {
                anags.add(ws);
            }
            
            
            if(windowEnd>=p.length()-1)
            {
                char left=s.charAt(ws);
                ws++;
                if(map.containsKey(left)){
                    if(map.get(left)==0)
                    matched--;
                map.put(left,map.getOrDefault(left,0)+1);
                }
            }
         
        }
        return anags;
        
        
    }
}