package stack;

import java.util.Stack;

public class Paranthesis {
	
	
	public boolean areBalanced(String s) {
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			
			Character x = s.charAt(i);
			if(x=='(' || x=='[' || x=='{') {
				stack.push(x);
				continue;
			}
            if(stack.empty()) {
            	return false;
            }
	    	
            Character check ;
            
            switch (x) {
			case ')':  
				      check = stack.pop();
				      if(check=='{' || check == '[') {
				    	  return false;
				      }
				      break;
		                 	
	   		case ']' :
	   			       check = stack.pop();
	   			       if(check == '(' || check == '{') {
	   			    	   return false;
	   			       }
	   			       break;
			
	   		case '}' :
			        	check = stack.pop();
			        	if(check == '[' || check == '(') {
			        		return false;
			        	}
			        	break;
	   			       
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + x);
			}
		}
		
		return stack.isEmpty();
	}
	
	

	public static void main(String[] args) {
		 Paranthesis paranthesis = new Paranthesis();
		 boolean value = paranthesis.areBalanced("([{}])");
		 System.out.println("Result :"+value);
	}
}
