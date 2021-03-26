class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int track=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[track++]=nums[i];
                
        }
        for(int i=track;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
        
    }
}