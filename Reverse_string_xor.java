
public class Reverse_string_xor {

	public static void Reverse_string(String s) {
		// TODO Auto-generated constructor stub

	char[] chararray = s.toCharArray();
	
	int begin = 0;
	int end = s.length()-1;
	
	while(begin < end) {
		
		chararray[begin] = (char) (chararray[begin]^chararray[end]);
		chararray[end] = (char) (chararray[begin]^chararray[end]);
		chararray[begin] = (char) (chararray[end]^chararray[begin]);
		begin++;
		end--;
	}
	
	System.out.println(chararray);	

	end = 0;
	begin = 0;
	
	java.util.Stack<Character> stack = new java.util.Stack<Character>();
	
	for(int i=0;i<chararray.length;i++) {
		
		stack.push(chararray[i]);
		
	}
	char[] final_array = new char[s.length()];
	int j=0;
	while(!stack.isEmpty()) {
		
		final_array[j] = stack.pop();
		j++;
	}

	System.out.println(final_array);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse_string("I am ashutosh");
		
		
	}

}
