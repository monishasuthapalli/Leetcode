class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int windowStart=0;
        int maxRepeatingCount=0;
        int longest=0;
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
            char left=s.charAt(windowEnd);
            map.put(left,map.getOrDefault(left,0)+1);
            maxRepeatingCount=Math.max(maxRepeatingCount,map.get(left));
            
            while(windowEnd-windowStart+1-maxRepeatingCount>k)
            {
                char right=s.charAt(windowStart);
                map.put(right,map.getOrDefault(right,0)-1);
                windowStart++;
            }
            
            
            
            longest=Math.max(longest,windowEnd-windowStart+1);
            
            
        }
        return longest;
    }
}