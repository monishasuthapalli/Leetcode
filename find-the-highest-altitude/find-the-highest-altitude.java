class Solution {
    public int largestAltitude(int[] gain) {
        int[] result=new int[gain.length+1];
        result[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            result[i]=gain[i]+result[i-1];
        }
        int max=0;
        for(int j=0;j<gain.length;j++){
            if(result[j]>max){
                max=result[j];
            }
        }
        return max;
    }
}