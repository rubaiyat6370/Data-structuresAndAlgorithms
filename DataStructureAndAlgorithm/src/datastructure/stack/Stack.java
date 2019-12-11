/**
 * 
 */
package datastructure.stack;

/**
 * @author Rubaiyat
 *
 */
public class Stack {
	
	private int[] stack = new int[1000000];
	
	private int top = 0;
	
	public void push(int data) {
		stack[top++] = data;
	}
	
	public int pop() {
		return stack[--top];
	}
	
	public int getTop() {
		return stack[top-1];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(20);
		stack.push(10);
		stack.push(23);
		stack.push(40);
		stack.push(22);
		stack.push(30);
		stack.push(110);
		
		System.out.println(stack.pop());
		System.out.println(stack.getTop());
		
		
	}

}

