        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1;i<=N;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);       
            }
        
        }
        
         if(q.size() == 0 && N > 0){return -1;}
        
        int level = 0;
        
        while(!q.isEmpty())
        {
            
            int size = q.size();
            
            for(int i=0;i<size;i++)
            {
                
                int node = q.poll();
        
                numCourses++;
                for(int neighbour: map.get(node))
                {
                 
                    indegree[neighbour]--;
                    if(indegree[neighbour] == 0)
                    {
                        q.add(neighbour);
                    }
                }
                
            }
            level++;
        }
        
       
     
        return numCourses == N ? level : -1;
    }
}
