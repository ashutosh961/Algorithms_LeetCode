class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int current = 0;
        int max = 1;
        if(nums.length == 0){return 0;}
        boolean onesFound  = false;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                onesFound = true;
                current ++;
            }
            else if(nums[i] == 0)
            {
                max = Math.max(max, current);
                current = 0;
            }
        }
        
         max = Math.max(max, current);
        if(!onesFound){return 0;}
        return max;      
    }
}
