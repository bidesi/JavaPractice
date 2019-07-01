package com.bidesi.code;

public class StackArray {

	int top;
	int MAX = 1000;
	int arr[] = new int[MAX];
	
	public StackArray() {
		top = -1;
	}
	
	public static void main(String[] args) {
		StackArray stack = new StackArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Pop Value: "+ stack.pop());
		System.out.println("Peek Value: "+ stack.peek());
		System.out.println("Pop Value: "+ stack.pop());
		System.out.println("Stack values: ");
		stack.traverse();
	}

	private void traverse() {
		while(top >= 0) {
			System.out.println(pop());
		}
	}

	private int peek() {
		if(top < 0) {
			System.out.println("Stack underflow!!!");
			return 0;
		}
		return arr[top];
	}

	private int pop() {
		if(top < 0) {
			System.out.println("Stack underflow!!!");
			return 0;
		}
		return arr[top--];
	}

	private void push(int value) {
		if(top >= MAX - 1) {
			System.out.println("Stack overflow!!!");
			return;
		}
		
		arr[++top] = value;
	}

}
