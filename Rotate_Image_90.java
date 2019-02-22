
public class Rotate_Image_90 {

	
	public static int R = 4;
	public static int C = 4;
	
	public static void transpose(int matrix[][]) {
		
		
		for(int i=0;i<R;i++) {
			
			for(int j=i;j<C;j++) {
				
			//	swap(matrix[j][i], matrix[i][j]);
				 int temp = matrix[i][j]; 
	                matrix[i][j] = matrix[j][i]; 
	                matrix[j][i] = temp; 
				
			}
			
		}
		
		
		
	}
	
	public static void reverse_columns(int matrix[][]) {
		
		
		for(int i=0;i<C;i++) {
			
			for(int j=0,k1=C-1;j<k1;j++,k1--) {
				
			//	swap(matrix[j][i],matrix[k1][i]);
				 int temp = matrix[j][i]; 
	                matrix[j][i] = matrix[k1][i]; 
	                matrix[k1][i] = temp; 	
			}
			
			
		}
		
	}
	
	
	public static void printsolution(int matrix[][]) {
		
		   for (int i = 0; i < matrix.length; i++) { 
	            for (int j = 0; j < matrix[0].length; j++) 
	                System.out.print(matrix[i][j] + " "); 
	            System.out.println(""); 
	        } 
		
		
		
	}
	
	public static void swap(int a,int b) {
		
		int temp = a;
		a=b;
		b=temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int matrix[][] = { { 1, 2, 3, 4 }, 
                  { 5, 6, 7, 8 }, 
                  { 9, 10, 11, 12 }, 
                  { 13, 14, 15, 16 } }; 

		  printsolution(matrix); 
		  
		  transpose(matrix);
		  reverse_columns(matrix);
		  
		  	printsolution(matrix); 
} 
		
		
	}


