import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Word_Break {

	/**
	 * @param args
	 */
	
	public static String break_word(List<String> dict,String strin,String out) 
	{
		
		if(strin.length()==0) {return null;}
		
		for(int i=0;i<strin.length();i++) {
			
			String wordbreak = strin.substring(0, i);
			
			if(dict.contains(wordbreak)) {break_word(dict,strin.substring(i)," "+wordbreak);}
			
		}
		
		return out;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "";
		List<String> dict = Arrays.asList("this","is","a","word","break","problem");
		
		str = break_word(dict,"thisisawordbreakproblem","");
		System.out.println(str);
	}
	
}
