class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int curr=target-nums[i]-nums[left]-nums[right];
                
                if(curr==0)
                return target-curr;
                if(Math.abs(curr)<Math.abs(smallest))
                {
                    smallest=curr;
                }
                if(curr>0)
                {
                    left++;
                }
                else
                    right--;
            }
        }
        
        return target-smallest;
        
        
    }
}