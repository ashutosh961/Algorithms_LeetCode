class SparseVector {
    
    public int[] array;
    SparseVector(int[] nums) {
        
        array = nums;
    }
    
    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        
        int result = 0;
        
        for(int i=0;i<array.length;i++)
        {
            if(array[i] != 0 && vec.array[i] != 0)
            {
                result += array[i] * vec.array[i];
            }
            else
            {
                continue;
            }
        }
        
        return result;
    }
}
​
// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
