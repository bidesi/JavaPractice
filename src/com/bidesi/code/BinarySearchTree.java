package com.bidesi.code;

public class BinarySearchTree {

	Node root;

	class Node {
		int key;
		Node left;
		Node right;

		public Node(int key) {
			this.key = key;
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertRecord(50);
		bst.insertRecord(30);
		bst.insertRecord(60);
		bst.insertRecord(45);
		bst.insertRecord(55);
		bst.insertRecord(70);
		bst.insertRecord(80);
		bst.insertRecord(10);
		bst.insertRecord(20);
		bst.insertRecord(40);

		bst.printInOrder();
		
		bst.searchKey(50);
		bst.searchKey(43);

	}

	@SuppressWarnings("null")
	private void searchKey(int key) {
		Node node = search(root, key);
		if(node != null) {
			System.out.println("Key found:"+ node.key+" --- "+ node.hashCode());
		}else {
			System.out.println("Given key "+ key +" not exists...");
		}
	}

	private Node search(Node root, int key) {
		if(root == null || root.key == key) {
			return root;
		}
		
		if(key < root.key) {
			return search(root.left, key);
		}
		return search(root.right, key);
		
	}

	private void insertRecord(int key) {
		root = insert(root, key);
	}

	private Node insert(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}

		if (key < root.key) {
			root.left = insert(root.left, key);
		}else if(key > root.key) {
			root.right = insert(root.right, key);
		}
		
		return root;
	}

	private void printInOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.key +" ---"+ root.hashCode());
			inOrder(root.right);
		}
	}

}
