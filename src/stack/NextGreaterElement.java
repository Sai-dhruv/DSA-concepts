package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int a[] = {2,6,3,8,15,7};
		int[] result = NGE(a);
		System.out.println(Arrays.toString(result));

	}
	public static int[] NGE (int[] a) {
		int a1[] = new int[a.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(a[0]);
		int n = a.length;
		Arrays.fill(a1, -1);
		int count = 0;
		for(int i=1;i<n;i++) {
			while(!stack.empty() && stack.peek() < a[i]) {
				a1[count] = a[i];
				stack.pop();
				count++;
			}
			stack.push(a[i]);
		}
		return a1;
	}

}