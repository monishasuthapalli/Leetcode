class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ngr=new int[nums.length];
    Stack<Integer> st=new Stack<>();
    st.push(nums.length-1);
    ngr[nums.length-1]=nums.length;
    int[] ans=new int[nums.length-k+1];
    for(int i=nums.length-1;i>=0;i--)
    {
        while(!st.isEmpty()&&nums[i]>=nums[st.peek()])
        {
            st.pop();
        }
        if(st.size()==0)
        {
            ngr[i]=nums.length;
        }
        else
        ngr[i]=st.peek();
        st.push(i);
        
    }
    
    int j=0;
    for(int i=0;i<nums.length-k+1;i++)
    {
        if(j<i)
            j=i;
            
       
            while(ngr[j]<i+k)
            j=ngr[j];
            
        ans[i]=nums[j];
    }
        
        return ans;
        
    }
}