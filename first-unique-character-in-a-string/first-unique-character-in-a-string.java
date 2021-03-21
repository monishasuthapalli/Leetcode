class Solution {
    public int firstUniqChar(String s) {
 
        HashMap<Character,Integer> map=new HashMap();
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(!map.containsKey(curr))
            {
                map.put(curr,i);
            }
            else
                map.put(curr,-1);
        }
        
        int min=Integer.MAX_VALUE;
        for(char c:map.keySet())
        {
            if(map.get(c)>-1&&map.get(c)<min)
                min=map.get(c);
        }
        
        if(min==Integer.MAX_VALUE)
            return -1;
        else
            return min;
        
    }
}