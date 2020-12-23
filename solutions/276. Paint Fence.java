class Solution {
    public int numWays(int n, int k) {
        
        if(n == 0){return 0;}
        
        if(n == 1){return k;}
        
        if(n == 2){ return k * k;}
        
        int[] dp = new int[n+1];
        
        dp[1] = k;// If n is 1, only one colors
        dp[2] = k*k; // If n is 2, only two colors only k*k combinations
        
        for(int i=3; i<=n; i++)
        {
            dp[i] = (dp[i-1] + dp[i-2])*(k-1); // if n is more than 3, then take previous two values and multiply k-1 with it 
        }
        
        return dp[n];
    }
}
