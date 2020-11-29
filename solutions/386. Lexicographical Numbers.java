class Solution {
    public List<Integer> lexicalOrder(int n) {
        
        List<Integer> output = new ArrayList<>();
        
        for(int i=1; i<=9; i++)
        {
            DFS(i, output, n);
        }
        
        return output;
    }
    
    public void DFS(int i, List<Integer> output, int n)
    {
        
        if(i > n)
        {
            return;
        }
        
        output.add(i);
        
        for(int j=0; j<=9; j++)
        {
            DFS(i*10 + j, output, n);
        }
    }
}
