import java.util.Scanner;
import java.util.*;
import java.st

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String s1 = s.next();
		
		String s2 = s.next();
		
		
		if(s1.length()!=s2.length()) {
			
			
			System.out.println("Not anagrams");
		}
		
		else {
			
			char[] Array1 = s1.toCharArray();
			char[] Array2 = s2.toCharArray();
			
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			
			if(Array1.equals(Array2))
			{
				
				System.out.println("Anagram");
			}
			
		}
		
	}

}
