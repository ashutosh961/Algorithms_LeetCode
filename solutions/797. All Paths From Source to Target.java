class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> output = new ArrayList<>();
        if(graph.length == 0){return output;}
        
        List<Integer> temp = new ArrayList<>();
        
        temp.add(0);
        backTrack(graph, temp, output, 0);
        
        
        return output;
    }
    
    
    public void backTrack(int[][] graph, List<Integer> temp, List<List<Integer>> output, int node)
    {
        if(node == graph.length-1)
        {
            output.add(new ArrayList<>(temp));
        }
        
        for(int i=0;i<graph[node].length;i++)
        {
            temp.add(graph[node][i]);
            backTrack(graph, temp, output, graph[node][i]);
            temp.remove(temp.size()-1);
        }
        
    }
}
