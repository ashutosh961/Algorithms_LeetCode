/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class In_place_string_reversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_string = "I am Ashutosh";
		StringBuffer s = new StringBuffer(s_string);
		Stack stac = new Stack();
		int length = s.length();
		char stack;
		StringBuffer s_new = new StringBuffer();
		for(int i=0;i<length/2;i++) {
			
			char temp = s_string.charAt(i);
			s.setCharAt(i,s.charAt(length-i-1));
			s.setCharAt(length-i-1,temp);
			
			
		}
		
		
		for(int j=0;j<length;j++) {
			
			if(!Character.isWhitespace(s.charAt(j))) {
				
				stac.push(s.charAt(j));
				
			}
			
			else if(j==length-1) {stac.push(s.charAt(j));}
			else {
				
				while(!stac.isEmpty()) {	
				 stack=stac.pop();
				 s_new.append((stack));
				// System.out.println(stack);		
				
				 }
			}
			s_new.append(" ");
			
		}
		
		
		
		System.out.println(s_new.toString());
		
	}

}
