class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int low=0,high=nums.length-1;
        
        //find the first unsorted element from beginning 
        while(low<nums.length-1&&nums[low]<=nums[low+1])
            low++;
        
        if(low==nums.length-1)
            return 0;
        
        
        //find the first unsorted element from end of the array
        while(high>0&&nums[high]>=nums[high-1])
            high--;
        
        int minEl=Integer.MAX_VALUE;
        int maxEl=Integer.MIN_VALUE;
        for(int i=low;i<=high;i++)
        {
            minEl=Math.min(minEl,nums[i]);
            maxEl=Math.max(maxEl,nums[i]);
        }
        
        //extend subarray if we encounter a element less than minimum to include
        while(low>0&&nums[low-1]>minEl)
            low--;
        
        
        //extend subarray if we encounter a element greater than max of the subarray to include it
        
        while(high<nums.length-1&&nums[high+1]<maxEl)
            high++;
        
        
        return high-low+1;
        
        
    }
}