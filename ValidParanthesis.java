/**
 * 
 */

/**
 * @author Ashutosh
 *
 */ class Stack{
	 int top=-1;
	 char char1;
	 char[] stack= new char[100];
	 
	 
	 
	 public void push(char data) {
		 
		 if(top==99) {System.out.println("StackOverFlow");}
		 
		 else {stack[++top]=data;}
		 
		 
	 }
	 public char pop() {
		 
		 if(top==-1) {
			 System.out.println("Stack UnderFlow");
			 return 0;
		 }
		 else {
			 
			 char1 = stack[top];
			 top--;
		 }
		 
		 
		return char1;
	 }
	 
	 
	 public boolean isEmpty() {
		 
		 if(top==-1)
		 {
	     System.out.println("The Stack is empty");
		 return true;
		 }
		 return false;
	 }
	 
	
 }



public class ValidParanthesis {

	/**
	 * @param args
	 */
	
	public boolean IsParanthesisMatched(char character1,char character2) {
		
		if(character1=='[' && character2==']') {
			return true;
		}
		else if(character1=='{' && character2=='}') {
			return true;
		}
		else if(character1=='(' && character2==')') {
			return true;
		}
		
		
		return false;
	}
	
	
	public boolean MatchingPairs(char[] exp) {
		
		Stack stack = new Stack();
		
	for(int i=0;i<exp.length;i++){
		
		if(exp[i]=='[' || exp[i]=='{' || exp[i]=='(')
		{
		 stack.push(exp[i]);	
		}
		
		if(exp[i]==']' || exp[i]=='}' || exp[i]==')') 
		{
			if(stack.isEmpty()) {			
				return false;		
			}
			
			else if(!IsParanthesisMatched(stack.pop(),exp[i])) {
				
				return false;
				
			}
		}		
	}
	

    if (stack.isEmpty())
      return true; /*balanced*/
    else
      {   /*not balanced*/
          return false;
      } 
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char exp[] = {'{','(',')','}','[',']'};
		
		ValidParanthesis brackets1 = new ValidParanthesis();
		
		if(brackets1.MatchingPairs(exp)==true) {
			System.out.println("Characters are balanced");
		}
		else {
			System.out.println("Not");
		}

	}

}
