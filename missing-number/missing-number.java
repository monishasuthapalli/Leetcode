class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum=sum+i;
        int sumd=nums.length+1;
        int res=((sumd*(sumd-1))/2)-sum;
        return res;
    }
}