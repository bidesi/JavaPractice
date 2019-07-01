package com.code.challenge;

/*
 * [5,3,4] , [2,4,9]
 * 435 + 249 = 684
 * return [4, 8, 6]
 * 
 */
public class ReverseJoinSumOfNodes {

	class Node {
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	Node node;
		

	public static void main(String[] args) {
		ReverseJoinSumOfNodes node1 = new ReverseJoinSumOfNodes();
		node1.add(5);
		node1.add(2);
		node1.add(3);

		ReverseJoinSumOfNodes node2 = new ReverseJoinSumOfNodes();
		node2.add(8);
		node2.add(4);
		node2.add(5);

		System.out.println("Node1 Data.....");
		node1.print();
		System.out.println("Node2 Data.....");
		node2.print();
		
		ReverseJoinSumOfNodes sumNodes = getSum(node1, node2);
		System.out.println("Result Node Data.....");
		sumNodes.print();
	}

	private static ReverseJoinSumOfNodes getSum(ReverseJoinSumOfNodes node1, ReverseJoinSumOfNodes node2) {
		
		int reverseNodeNum1 = reverseNodeNum(node1);
		int reverseNodeNum2 = reverseNodeNum(node2);
		
		int sum = reverseNodeNum1 + reverseNodeNum2;
		String reverseSum = reverseNumber(sum);
		
		ReverseJoinSumOfNodes resultNode = new ReverseJoinSumOfNodes();
		for(int i = 0; i< reverseSum.length(); i++) {
			resultNode.add(Character.getNumericValue(reverseSum.charAt(i)));
		}
		
		return resultNode;
	}

	private static String reverseNumber(int sum) {
		StringBuilder strBuld = new StringBuilder();
		strBuld.append(sum);
		return strBuld.reverse().toString();
	}

	private static int reverseNodeNum(ReverseJoinSumOfNodes nodeNum) {
		StringBuilder num = new StringBuilder();
		Node current = nodeNum.node;
		while(current != null) {
			num.append(current.key);
			current = current.next;
		}
		
		
		return Integer.parseInt(num.reverse().toString());
	}

	private void print() {
		Node current = node;
		while(current != null) {
			System.out.println(current.key);
			current = current.next;
		}
	}

	private void add(int key) {	
		if(node == null) {
			node = new Node(key);
		}else {
			Node current = node;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(key);
		}
	}

	
	
	

}
