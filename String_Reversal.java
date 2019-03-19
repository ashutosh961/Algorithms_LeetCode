import java.util.*;
public class String_Reversal {

	
     
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
			     String s = "Hello there Ashutosh";
	           StringBuilder  sb = new StringBuilder();
			     java.util.Stack<String> st  = new java.util.Stack<String>();
			     
			     String[] sa =  s.split(" ");
			     
			     for(int i=0;i<sa.length;i++){
			         
			         st.push(sa[i]);
			      //   System.out.println(sa[i]);
			     }
			     System.out.println(st.toString());
                  while(!st.isEmpty()) {sb.append(st.pop()+" ");
                   }
			     System.out.println(sb);
	}

}
