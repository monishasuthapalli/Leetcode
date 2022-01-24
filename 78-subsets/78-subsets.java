class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //Resultant subset
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        //this loop executes for all the numbers in the list
        for(int i:nums)
        {
            
            int n=res.size();
            for(int sub=0;sub<n;sub++)
            {
                //creating a list from existing list
                List<Integer> set=new ArrayList<>(res.get(sub));
                set.add(i);
                res.add(set);
            }
            
        }
        
        return res;
        
    }
}