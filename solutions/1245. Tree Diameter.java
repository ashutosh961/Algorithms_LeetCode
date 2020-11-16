class Solution {
    int max = 0;
    int farthest = -1;
    public int treeDiameter(int[][] edges) {
        
        if(edges.length == 0){return 0;}
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        
        for(int i=0;i<edges.length;i++)
        {
            map.putIfAbsent(edges[i][0], new ArrayList<>());
            map.putIfAbsent(edges[i][1], new ArrayList<>());
            
            map.get(edges[i][1]).add(edges[i][0]);
            map.get(edges[i][0]).add(edges[i][1]);
        }
        
        DFS(edges, map,new HashSet<>(), edges[0][0], 0);
        //System.out.println(farthest);
        max = 0;
        DFS(edges, map,new HashSet<>(),farthest , 0);
        return max;
    }
    
    public void DFS(int[][] edges, Map<Integer, List<Integer>> map, Set<Integer> visited, int node, int distance)
    {
        
        if(!map.containsKey(node)){return;}
​
        
        if(distance > max)
        {
            max = distance;
            farthest = node;
        }
         visited.add(node);
        for(int neighbour : map.get(node))
        {
            if(!visited.contains(neighbour))
            {
                DFS(edges, map, visited, neighbour, distance+1);
            }
        }
    }
}
