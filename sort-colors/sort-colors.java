class Solution {
    public void sortColors(int[] nums) {
        
        int low=0,high=nums.length-1;
        for(int i=0;i<=high;)
        {
                if(nums[i]==0)
                {
                    swap(nums,i,low);
                    low++;
                    i++;
                }
                else if(nums[i]==1)
                {
                    i++;
                }
                else if(nums[i]==2)
                {
                    swap(nums,i,high);
                    high--;
                    
                }
            
        }
        
    } 
        public void swap(int[] nums,int i,int idx)
        {
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
        
        
    }
