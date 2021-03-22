class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0)
            return false;
     return (int)(Math.ceil(Math.log10(n)/Math.log10(2))) == (int)      (Math.floor(Math.log10(n)/Math.log10(2)));
    }
}