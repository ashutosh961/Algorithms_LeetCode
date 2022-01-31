class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        int k=0;
        int l=0;
        int m=matrix.length;
        int n=matrix[0].length;
        
        while(k < m && l < n)
        {
            
            for(int i=l; i<n; i++)
            {
                list.add(matrix[k][i]);
            }
            k++;
            
            for(int i=k; i<m; i++)
            {
                list.add(matrix[i][n-1]);
            }
            n--;
            
            if(m > k )
            {
                for(int i=n-1; i>=l; i--)
                {
                    list.add(matrix[m-1][i]);
                }
                m--;
            }
            if( n > l){
                for(int i=m-1;i>=k;i--)
                {
                    list.add(matrix[i][l]);
                }
                l++;
            }
              
        }
        
        return list;
    }
}
