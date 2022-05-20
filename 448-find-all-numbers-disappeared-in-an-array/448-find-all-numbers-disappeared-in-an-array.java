class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int start=0;
        List<Integer> al=new ArrayList<>();
        while(start<nums.length)
        {
            if(nums[start]!=nums[nums[start]-1])
                swap(nums,start,nums[start]-1);
            else
                start++;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(i+1!=nums[i])
               al.add(i+1);
        }
        
        return al;
    }
    
     private void swap(int[] nums,int a,int b)
    {
        int c= nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
}