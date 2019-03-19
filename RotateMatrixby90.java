/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class RotateMatrixby90 {

	/**
	 * @param args
	 */
	
	public static int R=4;
	public static int C=4;
	
	
	public static void swap(int a,int b) {
		
		int temp = a;
		a=b;
		b=temp;
		
	}
	
	public static void gettranspose(int grid[][]) {
		
		
		for(int  i=0;i<R;i++) {
			
			for(int j=i;j<C;j++) {
				
				swap(grid[i][j],grid[j][i]);
			}
		}
		
		
		/*for(int i=0;i<R;i++) {
			
			for(int j=0;j<C;j++) {
				
				System.out.println(grid[i][j]+"\t");
			}
			
			//System.out.println("\t");
		}*/
		
	}
	
	public static void ReverseColumns(int grid[][]) {
		int j,k;
		
		for(int i=0;i<C;i++) {
			
			
			for( j=0,k=C-1;j<k;j++,k--) {
				
				swap(grid[j][i],grid[k][i]);
				
			}
		}
		
		
       for(int i=0;i<R;i++) {
			
			for(int l=0;l<C;l++) {
				
				System.out.print(grid[i][l]+" ");
				System.out.println(" ");
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[][] arr=new int[][] { {1, 2, 3, 4},
			        {5, 6, 7, 8},
			        {9, 10, 11, 12},
			        {13, 14, 15, 16}};
			        
			        gettranspose(arr);
			        ReverseColumns(arr);
	}

}
