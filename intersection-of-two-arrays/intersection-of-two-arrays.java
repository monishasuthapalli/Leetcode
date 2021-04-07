class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer> s1=new HashSet<>();
        for(int i:nums1)
            s1.add(i);
        HashSet<Integer> s2=new HashSet<>();
        for(int i:nums2)
            s2.add(i);
         HashSet<Integer> s3=new HashSet<>();
        s1.retainAll(s2);
        int[] res=new int[s1.size()];
        int j=0;
        for(Integer i:s1)
            res[j++]=i;
        
        return res;
            
    }
}