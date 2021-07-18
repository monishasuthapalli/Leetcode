class Solution {
    public int largestRectangleArea(int[] heights) {
        //nextSmallerElementsonTheRight
    
    int[] nsr=new int[heights.length];
    Stack<Integer> st=new Stack<>();
    st.push(heights.length-1);
    
    for(int i=heights.length-1;i>=0;i--)
    {
        //pop all the greater elements
        while(st.size()>0&&heights[st.peek()]>=heights[i])
        {
            st.pop();
        }
        if(st.size()==0)
        {
            nsr[i]=heights.length;
        }
        else
        {
            nsr[i]=st.peek();
        }
        st.push(i);
    }
    
    int[] nsl=new int[heights.length];
    st=new Stack<>();
    st.push(0);
    
    for(int i=0;i<heights.length;i++)
    {
        //pop all the greater elements
        while(st.size()>0&&heights[st.peek()]>=heights[i])
        {
            st.pop();
        }
        if(st.size()==0)
        {
            nsl[i]=-1;
        }
        else
        {
            nsl[i]=st.peek();
        }
        st.push(i);
    }
    
    int max=0;
    for(int i=0;i<heights.length;i++)
    {
        max=Math.max(max,heights[i]*(nsr[i]-nsl[i]-1));
        
    }
    
   return max;
    
  }
    }
