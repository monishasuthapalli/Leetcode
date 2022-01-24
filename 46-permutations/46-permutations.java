class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<List<Integer>> permutations=new LinkedList<>();
        permutations.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++)
        {
            int n=permutations.size();
            for(int j=0;j<n;j++)
            {
            List<Integer> oldPermutation=permutations.poll();
            for(int k=0;k<=oldPermutation.size();k++)
            {
                List<Integer> newPerm=new ArrayList<Integer>(oldPermutation);
                newPerm.add(k,nums[i]);
                if(newPerm.size()==nums.length)
                {
                    result.add(newPerm);
                    
                }
                else
                {
                    permutations.add(newPerm);
                }
            }
                
                
                
            }
        }
        return result;
    }
}