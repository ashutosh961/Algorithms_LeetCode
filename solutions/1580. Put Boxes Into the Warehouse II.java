class Solution {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
      
        Arrays.sort(boxes);
        
        int res = boxes.length-1;
        int l = 0;
        int r = warehouse.length-1;
        
        int count = 0;
        
        while(l <= r && res >= 0)
        {
            if(boxes[res] <= warehouse[l])
            {
                l++;
                count ++;
            }
            else if(boxes[res] <= warehouse[r])
            {
                r--;
                count ++;
            }
            res--;
            
        }
     return count;   
    }
}
