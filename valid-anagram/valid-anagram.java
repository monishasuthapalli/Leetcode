class Solution {
    public boolean isAnagram(String s, String t) {
       char[] s1=s.toCharArray();
       char[] s2=t.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
       String first=new String(s1);
       String second=new String(s2);
       if(first.equals(second))
           return true;
        else
            return false;
    }
}