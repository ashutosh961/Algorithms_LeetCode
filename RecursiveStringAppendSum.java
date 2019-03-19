
public class RecursiveStringAppendSum {

	static int sum1=0;
	public static int findsum(int n,int k) {
		int c=0;
		int sum=0;
		int sum1=0;
		while(c<k) {
			
			String x = Integer.toString(n);
			String[] digits = (""+x).split("");
			int[] intdigits = new int[digits.length];
			for(int i=0;i<digits.length;i++) {
				intdigits[i] = Integer.valueOf(digits[i]);
				 sum+=intdigits[i];
				 }
			
			c++;
				
		}
		//sum1 = sum;
		 //System.out.println(sum);
		if(Integer.toString(sum).length()>1) { return findsumutil(sum,1);
		
		 }

	return sum;
	}
	
	public static int findsumutil(int n,int k) {
		int sum1 = findsum(n,k);
		int l =CheckAppend(n,sum1);
		System.out.println(l);
		return l;
	}
	
	public static int CheckAppend(int n,int sum) {
		if(sum>0 && n>0) {
			
			if(n%sum==0) {
				return sum;
			}
			else {
			return n%sum;
			}
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	RecursiveStringAppendSum re = new RecursiveStringAppendSum();
		
		findsum(24, 3);
		
		
		
		
	}

}
