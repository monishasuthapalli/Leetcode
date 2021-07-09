class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        int idx=nums.length-1;
        int[] arr=new int[nums.length];
        while(left<=right)
        {
            int squareLeft=nums[left]*nums[left];
            int squareRight=nums[right]*nums[right];
            if(squareLeft>squareRight)
            {
                arr[idx]=squareLeft;
                left++;
                idx--;
            }
            else if(squareLeft<squareRight)
            {
                arr[idx]=squareRight;
                right--;
                idx--;
            }
            else
            {
                arr[idx]=squareRight;
                right--;
                idx--;
            }
        }
        
        return arr;
    }
}