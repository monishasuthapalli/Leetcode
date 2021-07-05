class Solution {
    public int totalFruit(int[] fruits) {
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int windowMax=Integer.MIN_VALUE;
        int windowStart=0;
        
        
        for(int windowEnd=0;windowEnd<fruits.length;windowEnd++)
        {
            map.put(fruits[windowEnd],map.getOrDefault(fruits[windowEnd],0)+1);
            
            
            while(map.size()>2)
            {
                int leftNum=fruits[windowStart];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum)==0)
                    map.remove(leftNum);
                
                windowStart++;
            }
            
            windowMax=Math.max(windowMax,windowEnd-windowStart+1);
           
            
            
        }
        
        return windowMax;
        
    }
}