class Solution {
    public boolean judgeCircle(String moves) {
        
        int ud=0,lr=0;
        for(int i=0;i<moves.length();i++)
        {
            char currChar=moves.charAt(i);
            if(currChar=='U')
                ud++;
            else if(currChar=='D')
                ud--;
            else if(currChar=='L')
                lr++;
            else if(currChar=='R')
                lr--;
        }
        
        return (lr==0)&&(ud==0);
        
    }
}