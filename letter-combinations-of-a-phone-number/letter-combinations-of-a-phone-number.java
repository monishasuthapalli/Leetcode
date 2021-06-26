class Solution {
    public List<String> letterCombinations(String digits) {
       String test=digits;
        if(test.length()==0)
        {
            return new ArrayList<String>();
        }
        
        else
        {
          List<String> al=letterCombination(digits);
          return al;
        }
    }
    
    
     List<String> letterCombination(String digits) {
        
        String[] words={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        if(digits.length()==0)
        {
             List<String> base=new ArrayList<>();
             base.add("");
             return base;
        }
        
        char ch=digits.charAt(0);
        String ros=digits.substring(1);
        List<String> al=letterCombination(ros);
        List<String> result=new ArrayList<>();
        
        String codeforch=words[Integer.parseInt(ch+"")-2];
        
        for(int i=0;i<codeforch.length();i++)
        {
            char charac=codeforch.charAt(i);
            for(String rest:al)
            {
                result.add(charac+rest);
            }
        }
        
        
        return result;
        
    }
}