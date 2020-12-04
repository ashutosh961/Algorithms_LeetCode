           int temp = row[l];
           row[l]  = row[r];
           row[r] = temp;
           
           l++;
           r--;
       }
    
    }
    
    public void print(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]);
        }
        System.out.println(" ");
    }
    
     public void flip(int[] row)
    {
        for(int i=0; i<row.length; i++)
        {
            if(row[i] == 0)
            {
                row[i] = 1;
            }
            else
            {
                row[i] = 0;
            }
          
        }
    }
}
