
public class BinaryGap {

	
	 public static int Binary_Gap(int num) {
		 
		 
		 int current =0;
		 int max = 0;
		 
		 
		 while(num>0)
		 {
			int  n = num%2;
			 
			 if(n==0) {current++;}
			 
			 else {max = Math.max(max, current);current=0;}
			 
			 
			 num=num/2;
		 }		 
		 
		 return max;
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number  = Binary_Gap(393);
		
		System.out.println("number "+number);
	}

}
