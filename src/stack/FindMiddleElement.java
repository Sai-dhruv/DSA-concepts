package stack;

import java.util.Stack;

public class FindMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		
		System.out.println(stack.size());
		
		//System.out.println(stack.get(3));
		
		int mid = stack.size() % 2 == 0 ? stack.size() / 2 : stack.size() % 2;
		
		System.out.println(stack.get(mid));

	}

}
