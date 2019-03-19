
public class Gaussian_Filter {

	static int M=480;
	static int N=500;
	static int kernel_M=5;
	static int kernel_N =5;
	double[][] Image = new double[M][N];
	public static final double PI = 3.14159265358979323846;
	public static  double[][] Gaussian_filter(double[][] gauss_kernel){
		
		double sigma = 1.0;//Test sigma val
		double denominator = 2.0*sigma*sigma;//2*sigma^2 sum
		double sum = 0.0;
		double numerator;//x^2+y^2 term
		gauss_kernel = new double[kernel_M][kernel_N];
		
		 for(int x = -2 ;x<=2;x++) {
			 
			 for(int y=-2;y<=2;y++) {
				 
				 numerator = Math.sqrt((x*x)+(y*y));
				 gauss_kernel[x+2][y+2] = (Math.exp(-((numerator*numerator)/denominator))/(2*PI*denominator));
				 sum+= gauss_kernel[x+2][y+2];
			 }
		 }
		 
		 System.out.println("Gaussian Kernel Matrix:");
		for(int i=0;i<kernel_M;i++) {
			
			for(int j=0;j<kernel_N;j++) {
				
				
				gauss_kernel[i][j]/=sum;
			}
		}
		
		return gauss_kernel;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] Gauss_ExperimentalKernel = new double[kernel_M][kernel_N];
	   Gauss_ExperimentalKernel = Gaussian_filter(Gauss_ExperimentalKernel);
	    
	    try {
	    for(int i=0;i<kernel_M;i++) {
	    	
	    	for(int j=0;j<kernel_N;j++)
	    	{
	    		
	    		System.out.print(Gauss_ExperimentalKernel[i][j]+" ");
	    		//System.out.print(" ");
	    	}System.out.println(" ");//Printing Gauss kernel Matrix
	    }
	    }catch(Exception e) {}
		 

	}

}
