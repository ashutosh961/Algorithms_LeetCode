class Solution {
    public int longestOnes(int[] A, int K) {
        
        int left = 0;
        int max = 0;
        int i=0;
        
        for(i=0; i<A.length; i++)
        {
            if(A[i] == 0)
            {
                K--;
            } 
            
            if(K < 0)
            {
                if(A[left] == 0){K++;}
                left ++;
            }
        }
        
        return i - left;
    }
}
