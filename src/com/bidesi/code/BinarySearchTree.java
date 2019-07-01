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

		System.out.println("-----In order-----");
		bst.printInOrder();
		System.out.println("-----Pre order-----");
		bst.printPreOder();
		System.out.println("-----Post order-----");
		bst.printPostOrder();
		
		
		bst.searchKey(50);
		bst.searchKey(43);
		
		int deleteVal = 40;
		System.out.println("After Delete key-->"+ deleteVal);
		bst.deleteKey(deleteVal);
		bst.printInOrder();
	}

	private void deleteKey(int key) {
		delete(root, key);
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
			if (root.left == null && root.right == null) {
				return null;
			}else if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}else {
				//find minimum value in the right tree in-case two children
				root.key = minValue(root.right);
				root.right = delete(root.right, root.key);
			}
		}
		
		return root;
	}

	private int minValue(Node root) {
		int minValue = root.key;
		while(root.left != null) {
			minValue = root.left.key;
			root = root.left;
		}
		
		return minValue;
	}

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

	private void printPreOder() {
		preOrder(root);
	}
	
	private void preOrder(Node root) {
		if(root != null) {
			System.out.println(root.key +"-->" + root.hashCode());
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private void printPostOrder() {
		postOrder(root);
	}

	private void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.err.println(root.key +"-->"+ root.hashCode());
		}
	}
}
