class Solution {
    Map<String,List<Transaction>> map=new HashMap<>();
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result=new ArrayList<>();
        for(String transaction:transactions)
        {
            Transaction curr=new Transaction(transaction);
            map.putIfAbsent(curr.name,new ArrayList());
            map.get(curr.name).add(curr);
        }
        
        for(String transaction:transactions)
        {
            
            if(!validTra(transaction))
            {
                result.add(transaction);
            }
        }
        
        
        return result;
        
    }
    
    boolean validTra(String transaction)
    {
        Transaction curr=new Transaction(transaction);
        for(Transaction t:map.get(curr.name))
        {
            
            if(curr.amount>1000)
            {
                return false;
            }
            else if((Math.abs(curr.time-t.time)<=60)&&!curr.city.equals(t.city))
            {
                return false;
            }
            
        }
        return true;
        
    }
    
    class Transaction
    {
        String name;
        int time;
        int amount;
        String city;
        Transaction(String input)
        {
            String[] inputs=input.split(",");
            name=inputs[0];
            time=Integer.parseInt(inputs[1]);
            amount=Integer.parseInt(inputs[2]);
            city=inputs[3];
        }
    }
    
    
}