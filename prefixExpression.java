import java.util.*;
import java.io.*;

public class prefixExpression{


    public static boolean IsOperand(char c){
        
        if(c >= 48 && c <=57){
            
            return true;
        
        }
        return false;
    }



     public static void main(String []args){

        
        String s = "+9/26";
        Stack<Double> st = new Stack<Double>();
        for(int i=s.length()-1;i>=0;i--){
            
            if(IsOperand(s.charAt(i))){
                
                st.push((double)s.charAt(i));
                
            }
            
            else
            {
                double val1 = st.peek();
                st.pop();
                double val2 = st.peek();
                st.pop();
                
                
                if(s.charAt(i)=='+'){double result = val1+val2;break;}
               else if(s.charAt(i)=='-'){double result = val1-val2;st.push(result);break;}
               else if(s.charAt(i)=='/'){double result = val1/val2;st.push(result);break;}
               else if(s.charAt(i)=='+'){double result = val1*val2;st.push(result);break;}
                
                
            }
            
        }
        System.out.println(st.peek());
     }
}