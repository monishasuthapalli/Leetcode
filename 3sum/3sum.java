class Solution {
    
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            searchTriplet(nums,-nums[i],i+1,triplets);
        }
        
        return triplets;
    }
    
    public static void searchTriplet(int[] arr,int target,int left,List<List<Integer>> triplets)
    {
        int right=arr.length-1;
        while(left<right)
        {
            int currSum=arr[left]+arr[right];
            if(currSum==target)
            {
                triplets.add(Arrays.asList(-target,arr[left],arr[right]));
                left++;
                right--;
                
                
                while(left<right&&arr[left]==arr[left-1])
                    left++;
                while(left<right&&arr[right]==arr[right+1])
                    right--;
            }
            
            else if(target>currSum)
                left++;
            else
                right--;
            
        }
        
    }
}