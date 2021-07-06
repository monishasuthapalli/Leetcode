class Solution {
    public int longestOnes(int[] nums, int k) {
        
        
        int windowStart=0;
        int longestSubArray=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++)
        {
            int right=nums[windowEnd];
            map.put(right,map.getOrDefault(right,0)+1);
            
            if(right==1)
                count++;
            while(windowEnd-windowStart+1-count>k)
            {
                int left=nums[windowStart];
                if(left==1)
                    count--;
                map.put(left,map.getOrDefault(left,0)-1);
                windowStart++;
            }
            
            
            longestSubArray=Math.max(longestSubArray,windowEnd-windowStart+1);
        }
        return longestSubArray;
    }
}