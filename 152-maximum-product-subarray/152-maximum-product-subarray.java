class Solution {
    public int maxProduct(int[] nums) {
        int currMax=1,currMin=1;
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>max)
                max=i;
        }
        int res=max;
        for(int n:nums)
        {
            if(n==0)
            {
                currMin=currMax=1;
                continue;
            }
            int temp=currMax*n;
            currMax=Math.max(Math.max(currMax*n,currMin*n),n);
            currMin=Math.min(Math.min(currMin*n,temp),n);
            res=Math.max(res,currMax);
            
            
        }
        return res;
    }
}