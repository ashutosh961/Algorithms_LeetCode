/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
class Power {
    public static double myPow(double x, int n) {
     
        if(n==0){return 1;}
        
        else if(n>0){
            
            if(n%2==0)
            {
                return myPow(x,n/2) * myPow(x,n/2);
            }            
            else{
                
                return x * myPow(x,n/2) * myPow(x,n/2);
            }
        }
        
        else{
            int p = n*(-1);
            if(p%2==0){return 1/(myPow(x,p/2) * myPow(x,p/2));}
            else {return 1/(x * (myPow(x,p/2) * myPow(x,p/2)));}
            
        }
    }
    
    public static double myPow_Modular(double x, int n) {
       double res = 1;  
        int p=n;
        if(n<0) {n = n*(-1);}
        while(n>0) {
        	if((n&1)==1) {
        	res =res *x;
        	System.out.println("reached res");}
        	n = n >> 1;
            System.out.println("n:"+n);
            x = x*x;
            System.out.println(x);
        }
          
        
     if(p<0) {return (1/res);}
        
      return res;
    }
    
    public static void main(String args[]) {
    	double result_rec = 0;
    	double result_mod = 0;
    	result_rec = myPow(2,4);
    	result_mod = myPow_Modular(2,8);
    	System.out.println(result_rec);
    	System.out.println(result_mod);
    }
}