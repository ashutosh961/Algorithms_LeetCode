class Solution {
    public void nextPermutation(int[] nums) {
        
        int i = nums.length-2;
        
        while(i >= 0 && nums[i] >= nums[i+1])
        {
            i--;
        }
        
        int j = nums.length-1;
        
        if(i >= 0)
        {
            while(j >= 0 && nums[i] >= nums[j])
            {
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, nums.length-1);
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void reverse(int[] arr, int i, int j)
    {
        while(i < j)
        {
            swap(arr,i,j);
            i++;
            j--;
