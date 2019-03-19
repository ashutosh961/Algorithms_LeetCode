/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	
	
	public static int set_char_roman(char c) {
	
		
		if(c== 'X') {return 10;}
		if(c == 'M') {return 1000;}
		if(c == 'L') {return 50;}
		if(c == 'D') {return 500;}
		if(c == 'V') {return 5;}
		if(c == 'I') {return 1;}
		if(c == 'C') {return 100;}
		
		return -1;
		
	}
	
	
	public static int convert_to_roman(String roman) {
		
		int res = 0;
		int s1 =0;
		int s2 =0;
		for(int i=0;i<roman.length();i++) {
			 s1 = set_char_roman(roman.charAt(i));
			if((i+1) < roman.length()) {
				
				 s2 = set_char_roman(roman.charAt(i+1));
				 
				 if(s1 >= s2) {res = res+s1;}
				 else {
					 res = res + s2 - s1;
					 i++;
				 }
			}
			else {
				
				res = res + s1;
				//i++;
			}
			
			
			
		}
		System.out.println(res);
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convert_to_roman("XC");
	}

}
