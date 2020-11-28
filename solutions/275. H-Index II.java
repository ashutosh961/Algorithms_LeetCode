class Solution {
    public int hIndex(int[] citations) {
        
      int left = 0;
      int right = citations.length-1;
      int n = citations.length;
      while(left <= right)
      {
        
          int middle = left + (right - left)/2;
          
          int condition = n - middle;
          
    
          
          if(citations[middle] > condition)
          {
              right = middle - 1;
          }
          else if(citations[middle] < condition)
          {
              left = middle + 1;
          }
          else{return condition;}
      }
        
        return n - left;
    }
}
