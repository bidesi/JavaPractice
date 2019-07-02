package com.code.challenge;

public class BalanceParenthesis {
	public static void main(String[] args) {
		
		char exp[] = {'{', '(', ')', '}', '[', ']', '('}; 
        if (areParenthesisBalanced(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");
	}

	private static boolean areParenthesisBalanced(char[] exp) {
		Stack stack = new Stack();
		int len = exp.length;
		for(int i = 0; i< len; i++) {
			if(exp[i] == '(' || exp[i] == '[' || exp[i] == '{') {
				stack.push(exp[i]);
			}else if(exp[i] == ')' || exp[i] == ']' || exp[i] == '}') {
				if(stack.isEmpty() || !bracketCompare(stack.pop(), exp[i]))
					return false;
			}
		}
		
		return stack.isEmpty();
	}

	private static boolean bracketCompare(char pop, char c) {
		if((c == ')' && pop != '(') || 
			(c == '}' && pop != '{') || 
			(c == ']' && pop != '[')) {
			return false;
		}
		return true;
	}

}

class Stack{
	int top = -1;
	char[] items = new char[99];
	
	void push(char item) {
		if(top == 99) {
			System.out.println("Over flow");
			return;
		}
		
		items[++top] = item;
	}
	
	char pop() {
		if(isEmpty()) {
			System.out.println("Underflow -- Empty");
			return '\0';
		}
		return items[top--];
	}
	
	char peek() {
		if(isEmpty()) {
			System.out.println("Underflow -- Empty");
			return 0;
		}
		return items[top];
	}
	
	boolean isEmpty() {
		return (top == -1);
	}
}
