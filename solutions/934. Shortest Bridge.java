class Solution {
    
    int startx = -1;
    int starty = -1;
    boolean found = false;
    Queue<int[]> q = new LinkedList<>();
    public int shortestBridge(int[][] A) {
        
        if(A.length == 0){return 0;}
        
        int i=0;
        int j=0;
        
        for(i=0; i<A.length; i++)
        {
            if(found){break;}
            
            for(j=0; j<A[0].length; j++)
            {
                if(A[i][j] == 1)
                { 
                    DFS(A, i, j);
                    found = true;
                    break;
                }
            }
        }
        
     //   printMatrix(A);
       return BFS(A, i, j); 
    }
    
    public void DFS(int[][] A, int i, int j)
    {
        if(i < 0 || i >= A.length || j < 0 || j >= A[0].length || A[i][j] == 0 || A[i][j] == 2 )
