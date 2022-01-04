class UndergroundSystem {
    public String  DELIMETER=",";
    Map<Integer,Event> arrivals;
    Map<String,Average> averages;
    public UndergroundSystem() {
        arrivals=new HashMap<>();
        averages=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id,new Event(id,stationName,t));
        
    }
    
    public void checkOut(int id, String stationName, int t) {
        Event e=arrivals.get(id);
        int diff=t-e.time;
        String key=e.stationName+DELIMETER+stationName;
        Average a=averages.containsKey(key)?averages.get(key):new Average();
        a.updateAverage(diff);
        averages.put(key,a);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+DELIMETER+endStation;
        Average avg=averages.get(key);
        return avg.getAverage();
    }
    
    class Event{
        int id;
        String stationName;
        int time;
        Event(int id,String stationName,int time)
        {
            this.id=id;
            this.stationName=stationName;
            this.time=time;
        }
    }
    
    class Average{
        double total;
        int count;
        
        public void updateAverage(int diff)
        {
            ++count;
            total+=diff;
        }
        
        public double getAverage() 
        {
            return total/count;
        }
        
        
    }
        
        
    }
    
    


/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */