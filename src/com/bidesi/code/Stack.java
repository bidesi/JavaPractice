package com.bidesi.code;

public class Stack {

	class Node{
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
			next = null;
		}
	}
	
	Node head;
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Pop value: "+ stack.pop());
		System.out.println("Pop value: "+ stack.peek());
	}

	private int peek() {
		if(head == null) {
			System.out.println("Stack underflow");
			return 0;
		}
		
		return head.key;
		
	}

	private int pop() {
		if(head == null) {
			System.out.println("Stack underflow");
			return 0;
		}
		
		int val = head.key;
		head = head.next;
		return val;
	}

	private void push(int key) {
		Node node = new Node(key);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = node;
		node.next = head;
		head = temp;
	}

}
