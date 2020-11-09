class Solution {
​
    int[] nums_copy;
    int[] nums_original;
    Random r;
    public Solution(int[] nums) {
         nums_copy = new int[nums.length];
         nums_original = nums;
         for(int i=0;i<nums.length;i++)
         {
             nums_copy[i] = nums[i];
         }
        r = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        
        return nums_original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
      
    
        for(int i=0; i<nums_copy.length; i++)
        {
            int index = r.nextInt(nums_copy.length);
            swap(nums_copy, i, index);
        }
        
     return nums_copy;   
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
​
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
