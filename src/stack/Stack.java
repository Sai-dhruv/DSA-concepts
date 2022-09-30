package stack;

public class Stack {

	public static  final int MAX = 20;
	int top ;
	int a[] = new int[MAX];
	boolean isEmpty() {
		return (0<top);
	}
	Stack() {
		top = -1;
	}
	boolean push(int x) {
		if(top<MAX-1) {
			a[++top] = x;
			System.out.println("Element Pushed "+x);
			return true;
		}else {
			System.out.println("Stack overflow");
			return false;
		}
	}

	int pop() {
		if(top == -1) {
			System.out.println("Stack underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}

	void print() {
		for(int i=0; i<=top; i++) {
			System.out.print(a[i]);
		}
	}

	public int size() {
		int i =0;
		int size = 0;
		for(i=1; i<=top; i++) {
			size = i;
		}
		return size;
	}
	public int get(int indexValue) {
		return a[indexValue];
	}
	public int getMiddleValue() {
		int mid = size() % 2 ==0 ? size()/2 : size() % 2;
		return get(mid);
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(11);
		s.push(22);
		s.push(33);
		System.out.println(s.getMiddleValue());			
	}



}
