class Solution {
    public int findLength(int[] A, int[] B) {
        
        
        if(A.length == 0 || B.length == 0){return 0;}
        
        int M = A.length;
        int N = B.length;
        
        int max = Integer.MIN_VALUE;
        int[] dp = new int[M+1];
        
        Arrays.fill(dp,0);
        
        for(int i=1;i<=M;i++)
        {
            for(int j=N;j>0;j--)
            {
                if(A[i-1] != B[j-1])
                {
                    dp[j] = 0;
                }
                else
                {
                    dp[j] = dp[j-1]+1;
                }
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}
