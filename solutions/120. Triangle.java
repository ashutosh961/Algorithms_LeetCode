class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] memo = new int[triangle.size()][triangle.size()];
        
        if(triangle.size() == 0){return 0;}
        
        return DFS(triangle, 0, 0, memo);
    }
    
    
    
    //Recursion
    public int DFS(List<List<Integer>> triangle, int i, int j, int[][] memo)
    {
        if(i == triangle.size()){return 0;}
        
        if(memo[i][j] != 0){return memo[i][j];}
        
      memo[i][j] =  triangle.get(i).get(j) + Math.min(DFS(triangle, i+1, j, memo), DFS(triangle, i+1, j+1, memo));
        
        return memo[i][j]; 
        
    }
    
}
