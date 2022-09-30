package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,2,1,5,3};
		//int a[] = {1,4,2,3,10}; // -1,2,-1,-1,-1
		int result[] = NSE(a);
		System.out.println(Arrays.toString(result));

	}

	public static int[] NSE (int[] a) {
		int a1[] = new int[a.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(a[0]);
		int n = a.length;
		Arrays.fill(a1, -1);
		for(int i=1;i<n;i++) {
			while(!stack.empty() && stack.peek() > a[i]) {
				a1[i-1] = a[i];
				stack.pop();
			}
			stack.push(a[i]);
		}
		return a1;
	}
}
