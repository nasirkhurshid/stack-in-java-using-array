/* Copyright @Nasir Khurshid, August 2021 */

public class stack {
	private int top, num;
	private int[] array;
	stack(){
		top=0;
		num=0;
		array=new int[num];
	}
	stack(int n) {
		num=n;
		top=0;
		array=new int[num];
	}
	public void push(int a) {
		array[top]=a;
		top++;
	}
	public void pop() {
		top--;
	}
	public int top() {
		return array[top-1];
	}
	public int size() {
		return top;
	}
	public boolean full() {
		return top==num;
	}
	public boolean empty() {
		return top==0;
	}
	public void makeempty() {
		top=0;
	}
	
	public static void main (String[] args) {
		stack st=new stack(3);
		st.push(1);
		st.push(3);
		st.push(5);
		System.out.println("Top element: "+st.top());
		System.out.println("Size of Stack: "+st.size());
		System.out.println("Is Stack full? ->"+st.full());
		st.pop();
		System.out.println("Top element: "+st.top());
		System.out.println("Size of Stack: "+st.size());
		System.out.println("Is Stack full? ->"+st.full());
		if(st.empty()) {
			System.out.println("Stack is empty!");
		}
		else {
			System.out.println("Making stack empty...");
			st.makeempty();
			if(st.empty()) {
				System.out.println("Stack is made empty successfully!");
			}
			else {
				System.out.println("Stack could not be made empty!");
			}
		}
		System.out.println("Stack Program Terminated!");
	}

}
