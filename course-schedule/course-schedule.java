class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            graph[i]=new ArrayList<>();
            
        }
        int[] inDegree=new int[numCourses];
        
        for(int[] e:prerequisites)
        {
            graph[e[0]].add(e[1]);
            inDegree[e[1]]++;
        }
        
        Queue<Integer> queue=new LinkedList();
        for(int i=0;i<numCourses;i++)
        {
            if(inDegree[i]==0)
            {
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty())
              {
                  int curr=queue.poll();
                  for(int c:graph[curr])
                  {
                      inDegree[c]--;
                      if(inDegree[c]==0)
                          queue.add(c);
                  }
                  numCourses--;
              }
        
        return numCourses==0;
        
    }
}