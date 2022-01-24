class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        int endIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            int startIndex=0;
            
            int n=res.size();
            if(i>0&&nums[i]==nums[i-1])
                startIndex=endIndex;
            endIndex=res.size();
            for(int j=startIndex;j<endIndex;j++)
            {
                List<Integer>set=new ArrayList<>(res.get(j));
                set.add(nums[i]);
                res.add(set);
            }
            
        }
        return res;
    }
}