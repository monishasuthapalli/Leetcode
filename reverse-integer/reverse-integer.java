class Solution {
    public int reverse(int x) {
        
        boolean flag=false;
        if(x<0)
        {
            flag=true;
            x=x*-1;
        }
        long rev=0;
        while(x>0)
        {
            rev=(rev*10)+(x%10);
            x=x/10;
            
        }
        
        if(rev>Integer.MAX_VALUE)
            return 0;
        
        if(flag==true)
        {
            return (int)(-1*rev);
                
        }
        else
            return (int)rev;
        
        
    }
}