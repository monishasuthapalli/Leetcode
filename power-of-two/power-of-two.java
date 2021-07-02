class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<0)
            return false;
        long i=1;
        while(i<=n)
        {
            if(i==n)
                return true;
            i=i*2;
            
        }
        return false;
        
    }
}