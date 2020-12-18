class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        if(nums.length == 0){return 0;}
        
        int max = 1;
        int pos = -1;
        int start = 0;
        
        for(int i=0;i<=nums.length;i++)
        {
            if( i == nums.length || nums[i] == 0)
            {
                
                max = Math.max(max, i - start);
                start = pos + 1;
                pos = i;
            }
        }
        
        return max;
    }
}
