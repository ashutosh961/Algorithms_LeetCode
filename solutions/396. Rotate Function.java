class Solution {
    public int maxRotateFunction(int[] A) {
     
        
        if(A.length == 0){return 0;}
        
        int max = eval(A);
        System.out.print(max);
        for(int i=0;i<A.length-1;i++)
        {
            rotate(A);
           // printArray(A);
          //  System.out.println(" ");
            int val = eval(A);
            if(val > max)
            {
                max = val;
            }
        }
        return max;
    }
    
    public void rotate(int[] arr)
    {
        int temp = arr[arr.length-1];
        
        for(int i=arr.length-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
      //  printArray(arr);
    }
    
    public void printArray(int[] arr){
