class Solution {
    public int removeDuplicates(int[] nums) {
        
        int nonDups=1;
        
        for(int next=1;next<nums.length;next++)
        {
            if(nums[next-1]!=nums[next])
            {
                nums[nonDups]=nums[next];
                nonDups++;
            }
        }
        return nonDups;
    }
}