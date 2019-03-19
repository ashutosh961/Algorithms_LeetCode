/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Cube_root {

	/**
	 * 
	 */
	
	
	public static double error(double mid,int x) {
	
		if(x>(mid*mid)) {return x-(mid*mid);}
		else {return mid*mid-x;}
		
	}
	
	public static double Cube_root(int x) {
	
		double start = 0;
		double end = x;
		double cube_root =0;
		while(start<end) {
			
			double mid = (start+end)/2;
			double e = 0.00001;
			
			double error_value = error(mid,x);

			if(error_value <= e) {cube_root = mid;return mid;}
			
			else if((mid*mid) > x) {end = mid;}
			else {start = mid;}
			
		}
		return cube_root;
		
		
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=Cube_root(16);
		System.out.println(x);
	}

}
