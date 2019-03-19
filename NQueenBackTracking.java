/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class NQueenBackTracking {

	/**
	 * @param args
	 */
	
	final static int N=4;
	
	
	public static boolean IsSafe(int grid[][],int row,int col) {
		
		
		for(int i=0;i<N;i++) {
			
			if (grid[row][i]==1) {
				return false;
			}
			
		}
		
		for(int i=row,j=col;i>=0 && j>=0;j--,i--) {
	
			 if(grid[i][j]==1) {
				return false; 
			 }
			
			
		}
		
		
		for(int i=row,j=col;i<N && j>=0;i++,j--) {
			
			if(grid[i][j]==1) {
				return false;
			}
			
		}
		
		return true;
	}
	
	
	public static boolean Solve(int grid[][],int col) {
		
		
		if(col>=N) {
			
			return true;
		}
		
		for(int i=0;i<N;i++) {
			
			if(IsSafe(grid,i,col)) {
				
				grid[i][col] = 1;
			
				if(Solve(grid,col+1)==true) {
					
					return true;
				}
				
				grid[i][col]=0;
			}	
		}
		return false;
	}
	
	
	public static void  printgrid(int grid[][]) {
		
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<N;j++){
				
				System.out.print(grid[i][j]);
				
			}
			System.out.println("");
		}
	}
	
	
	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		 int board[][] = {{0, 0, 0, 0},
		            {0, 0, 0, 0},
		            {0, 0, 0, 0},
		            {0, 0, 0, 0}
		        };
		 
		        if (Solve(board, 0) == false)
		        {
		            System.out.print("Solution does not exist");
		            
		        }
		 
		        printgrid(board);
		        
		
	}

}
