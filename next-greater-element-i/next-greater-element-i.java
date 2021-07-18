class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums2.length];
        st.push(nums2[nums2.length-1]);
        ans[ans.length-1]=-1;
        for(int i=nums2.length-2;i>=0;i--)
        {
            if(nums2[i]>st.peek())
            {
               while(!st.isEmpty()&&st.peek()<nums2[i])
               {
                   st.pop();
               }
               ans[i]=st.size()==0?-1:st.peek();
               st.push(nums2[i]);
            }
            else
            {
               ans[i]=st.size()==0?-1:st.peek();
               st.push(nums2[i]);
            }
        }
        
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
           int t= search(nums1[i],nums2);
           result[i]=ans[t];
           
        }
        
      return result;
            
    }
    
    int search(int target,int[] nums2)
    {
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i]==target)
                return i;
        }
        return -1;
    }
    
    
    
    
    
    
    
    
}