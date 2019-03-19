/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class SudokuSolve {

	/**
	 * @param args
	 * 
	 */
	
	public static final int N=9;
	public static final int UNASSIGNED = 0;
	
	
	public static boolean IsUnassigned(int grid[][],int row,int col) {
		
		
		
		for(int i=0;i<N;i++) {
			
			
			for(int j=0;j<N;j++) {
				if(grid[row][col] == UNASSIGNED ) {
					return true;			
				}
			}
		}
		return false;
	}
	
	
	public static boolean UsedInRow(int grid[][],int row,int num) {
		
		for(int cols=0;cols<N;cols++) {
			
			if(grid[row][cols]==num) {
				
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
   public static boolean UsedInCol(int grid[][],int col,int num) {
		
		for(int rows=0;rows<N;rows++) {
			
			if(grid[rows][col]==num) {
				
				return true;
			}
			
			
		}
		
		return false;
	}
   
   public static boolean UsedInBox(int grid[][],int startrowbox,int startcolbox,int num) {
		
 		for(int rows=0;rows<3;rows++) {
 			
 			for(int cols=0;cols<3;cols++) {
 			
 			if(grid[rows+startrowbox][cols+startcolbox]==num) {
 				
 				return true;
 			}
 			}
 			
 		}
 		
 		return false;
 	}  
  
   
   public static boolean IsSafe(int grid[][],int row,int col,int num) {
	   
	   
	   return(!UsedInCol(grid,col,num)&&!UsedInRow(grid,row,num)&&!UsedInBox(grid,row-row%3,col-col%3,num));
	   
	   
   }
	
	public static void printgrid(int grid[][]) {
		
		
		for(int row=0;row<N;row++) {
			
			
			for(int col=0;col<N;col++) {
				
				
				System.out.println(grid[row][col]);
			}
		}
	}
	
	
	
	public static boolean SolveSudoku(int grid[][]) {
		int row=0;
		int col=0;
		
		if(IsUnassigned(grid,row,col)) {
			
			return true;
		}
		
		for(int num=0;num<=9;num++) {
			
			
			if(IsSafe(grid,row,col,num)) {
				
				grid[row][col] =num;
				
			}
			try {
			if(SolveSudoku(grid)) {
				
				return true;
			}}catch(Exception e ) {
				
				
			}
			
			grid[row][col]=UNASSIGNED;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
final int[][] grid=new int[][]{{3, 0, 6, 5, 0, 8, 4, 0, 0},
                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
                 {0, 0, 5, 2, 0, 6, 3, 0, 0}};
if (SolveSudoku(grid) == true)
     printgrid(grid);
else
    System.out.println("No solution exists");



	}

}
