/**
 * 
 */
package com.bidesi.code;

/**
 * @author Bidesi
 *
 */
public class LinkedList {
	
	private class Node {
		
		private int data;
		private Node nextNode;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	Node node;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.insertNode(40);
		linkedList.insertNode(10);
		linkedList.insertNode(30);
		linkedList.insertNode(50);
		linkedList.insertAtPosition(3, 65);
		
		linkedList.traverse();
		
		System.out.println("check if linked list is Cyclic: "+ linkedList.isCyclic());
		
		//linkedList.deleteByValue(330);
		//linkedList.traverse();
		//linkedList.deleteByPosition(-1);
		//linkedList.traverse();
		
		linkedList.reverse();
		System.out.println("After Reverse..");
		linkedList.traverse();
	}

	private void reverse() {
		Node current, prev = null;
		Node pointer = node;
		
		while(pointer != null) {
			current = pointer;
			pointer = pointer.nextNode;
			
			current.nextNode = prev;
			prev = current;
			node = current;
		}
	}

	private void insertAtPosition(int position, int data) {
		if(position < 1) {
			System.out.println("invalid position !!!");
			return;
		}
		
		Node newNode = new Node(data);
		
		if(position == 1) {
			newNode.nextNode = node;
			node = newNode;
			return;
		}
		
		Node temp = node;
		int i = 1;
		while(i < position-1 && temp.nextNode != null) {
			temp = temp.nextNode;
			i++;
		}
		newNode.nextNode = temp.nextNode;
		temp.nextNode = newNode;
	}

	private void deleteByPosition(int position) {
		Node temp = node;
		if(position <1) {
			return;
		}
		
		int index = 1;
		while(index < position - 1 && temp != null) {
			temp = temp.nextNode;
			index++;
		}
		
		if(position == 1) {
			node = temp.nextNode;
		}else if(temp.nextNode != null) {
			temp.nextNode = temp.nextNode.nextNode;
		}else {
			temp.nextNode = null;
		}
		
	}

	private void deleteByValue(int key) {
		Node prevNode = null;
		Node currentNode = node;
		
		if(currentNode != null && currentNode.data == key) {
			node = currentNode.nextNode;
			return;
		}
		
		while(currentNode != null && currentNode.data != key) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		if(currentNode == null) return;
		
		prevNode.nextNode = currentNode.nextNode;
	}

	private boolean isCyclic() {
		Node slow = node;
		Node fast = node;
		
		while(fast != null && fast.nextNode != null) {
			fast = fast.nextNode.nextNode;
			slow = slow.nextNode;
			
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
	}

	private void traverse() {
		Node n = node;
		while(n != null) {
			System.out.println("Key: "+ n.data + " Hashcode: "+ n.hashCode());
			n = n.nextNode;
		}
	}

	private void insertNode(int key) {
		//node = insert(node, key); //recursive method
		if(node == null) {
			node = new Node(key);
		}else {
			Node current = node;
			while(current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = new Node(key);
		}
	}

	private Node insert(Node node, int key) {
		if(node == null) {
			return new Node(key);
		}
		
		node.nextNode = insert(node.nextNode, key);
		
		return node;
	}

}
