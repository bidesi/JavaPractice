package com.bidesi.practice;

public class BinarySearchTree {

	class Node{
		int key;
		Node left;
		Node right;
		
		public Node(int value) {
			this.key = value;
		}
	}
	
	Node root;
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		int[] arr = {400, 300, 230, 190, 430};
		
		for(int key : arr)
			bst.insertKey(key);
		
		bst.inorder();
		
		bst.checkKeyExist(30);
		bst.checkKeyExist(300);
		
		bst.deleteKey(230);
		
		bst.inorder();
	}

	private void deleteKey(int key) {
		Node node = delete(root, key);
		System.out.println("replaced node..."+ node.hashCode());
	}

	private Node delete(Node root, int key) {
		if(root == null) {
			return root;
		}
		
		if(key < root.key) {
			root.left = delete(root.left, key);
		}else if(key > root.key) {
			root.right = delete(root.right, key);
		}else {
			if(root.left == null) 
				return root.right;
			else if(root.right == null) 
				return root.left;
				
			root.key = minValue(root.right, key);
			root.right = delete(root.right, root.key);
		}
		return root;
	}

	private int minValue(Node root, int key) {
		int minValue = root.key;
		while(root.left != null) {
			minValue = root.left.key;
			root = root.left;
		}
		return minValue;
	}

	private void checkKeyExist(int key) {
		Node node = checkNodeExist(root, key);
		if(node != null) {
			System.out.println("Key "+ node.key + " found at node --- "+ node.hashCode());
		}else {
			System.out.println("Key "+ key +" does not found!!!");
		}
	}

	private Node checkNodeExist(Node root, int key) {
		if(root == null || root.key == key) {
			return root;
		}
		
		if(key < root.key) {
			return checkNodeExist(root.left, key);
		}
		return checkNodeExist(root.right, key);
	}

	private void inorder() {
		printInOrder(root);
	}

	private void printInOrder(Node root) {
		if(root != null) {
			printInOrder(root.left);
			System.out.println(root.key +" --- "+ root.hashCode());
			printInOrder(root.right);
		}
	}

	private void insertKey(int key) {
		root = insert(root, key);
	}

	private Node insert(Node root, int key) {
		if(root == null ) {
			root = new Node(key);
		}
		
		if(key < root.key) {
			root.left = insert(root.left, key);
		}else if(key > root.key) {
			root.right = insert(root.right, key);
		}
		return root;
	}

}
