class Solution {
    public int missingNumber(int[] nums) {
        
        int start=0;
        
        while(start<nums.length)
        {
            if(nums[start]<nums.length&&nums[start]!=nums[nums[start]])
                swap(nums,start,nums[start]);
            else
                start++;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
                return i;
        }
        
        return nums.length;
    }
    
    private void swap(int[] nums,int a,int b)
    {
        int c= nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
}