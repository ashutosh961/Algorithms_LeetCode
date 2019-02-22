
public class In_place_word_reversal_in_a_string {

	public static char[] s;
	public static void reverse_words(char[] s) {
		
		int temp = 0;
		int begin = 0;
		int start =0 ;
		
		while(temp<s.length) {
			
			
			
			System.out.println(s[temp]);
			if(temp == s.length-1) {
				System.out.println("Array End");
				reverse(begin,temp);
				
			}
			
		    if(s[temp]==' ') {
		    	System.out.println(begin);
		    	System.out.println(temp);
				reverse(begin,temp-1);
				System.out.println(s);
				begin = temp+1;
			}
			temp++;
		}
		System.out.println(s);
		reverse(start,temp-1);
		System.out.println(s);
	}
	
	public static void reverse(int begin,int end) {
		while(begin <= end) {
		char temporary = s[begin];
		s[begin++] = s[end];
		s[end--] = temporary;
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s_string = "I am Ashutosh";
		s = s_string.toCharArray();
		reverse_words(s);

	}

}
