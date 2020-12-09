        for(int i=1;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                dp[i][j] = arr[i][j] + findMin(dp, i, j, M, N);
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
        //Last row min
        int min = Integer.MAX_VALUE;
        
        for(int j=0;j<N;j++)
        {
            min = Math.min(min, dp[M-1][j]);
        }
        
        return min;
    }
    
    
    public int findMin(int[][] dp, int i, int j, int M, int N)
    {
        
        int min = Integer.MAX_VALUE;
        
        for(int k=0;k<N;k++)
        {
            if(k!= j)
            {
                min = Math.min(min, dp[i-1][k]);
            }
        }
        
        return min;
    }
}
