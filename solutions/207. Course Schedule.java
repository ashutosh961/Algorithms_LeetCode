class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(prerequisites.length ==0){return true;}
        int[] indegree = new int[numCourses];
        Map<Integer,List<Integer>> graph = new HashMap<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int v=0;v<prerequisites.length;v++)
        {
                indegree[prerequisites[v][1]]++;
            // graph.computeIfAbsent(prerequisites[v][0], value -> new             ArrayList()).add(prerequisites[v][1]);
               if(!graph.containsKey(prerequisites[v][0]))
               {
                   List<Integer> l = new ArrayList<>();
                   l.add(prerequisites[v][1]);
                   graph.put(prerequisites[v][0],l);
               }
            else{
                List<Integer> l = new ArrayList<>();
                l = graph.get(prerequisites[v][0]);
                l.add(prerequisites[v][1]);
                 graph.put(prerequisites[v][0],l);
            }
        }
        
        for(int i=0;i<indegree.length;i++){
          
            if(indegree[i] == 0){
                q.add(i);
            }
        }
       
        int course = 0;
        
        while(!q.isEmpty()){
            
            int startnode = q.poll();
            
            course++;
