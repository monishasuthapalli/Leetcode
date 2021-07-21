class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int windowStart=0;
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
                
            
                if(map.containsKey(s.charAt(windowEnd)))
                {
                    //sometimes windows start could be lagging behind
                    windowStart=Math.max(windowStart,map.get(s.charAt(windowEnd))+1); 
                }
                map.put(s.charAt(windowEnd),windowEnd);
                maxLength=Math.max(maxLength,windowEnd-windowStart+1);
            
        }
        return maxLength;
    }
}