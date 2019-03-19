/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Merge_alternate_strings {

	/**
	 * @param args
	 */
	
	public static String mergestring;
	public static int length = 0;
	public static int largest_length = 0;
	public static int i = 0;
	public static void merge_alternate(String A,String B) {
		
		if(A.length()<B.length()) {length = A.length();largest_length=B.length(); }
		if(A.length()>B.length()) {length = B.length();largest_length=A.length(); }
		
		else {length = A.length();}
		
		for(i=0;i<length;i++) {
			
			mergestring += Character.toString(A.charAt(i))  + Character.toString(B.charAt(i));
			
		}
		
		while(i != largest_length-1) {
		if(A.length()>B.length()) {if(A.charAt(i)!='\0') {mergestring +=Character.toString(A.charAt(i));};i++;}
		if(A.length()<B.length()) {if(B.charAt(i)!='\0') {mergestring +=Character.toString(B.charAt(i));i++;}}
		}
		System.out.println(mergestring);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge_alternate("abcxyz","def");
	}

}
