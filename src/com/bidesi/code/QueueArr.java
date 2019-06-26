package com.bidesi.code;

public class QueueArr {
	int[] arr;
	int rear;
	int capacity;
	int front;
	int count;
	
	public QueueArr(int size) {
		rear = -1;
		front = 0;
		count = 0;
		capacity = size;
		arr = new int[size];
	}
	
	public static void main(String[] args) {
		QueueArr queue = new QueueArr(100);
		
		queue.enque(109);
		queue.enque(209);
		queue.enque(308);
		queue.enque(405);
		queue.enque(699);
		
		queue.printQueue();
		
		queue.deque();
		queue.deque();
		queue.deque();
		
		queue.peek();
		queue.peek();
		
	}

	private void printQueue() {
		int size = 0;
		System.out.println("Queued values...");
		while(size < count){
			System.out.print(arr[size]+ ", ");
			size++;
		}
		System.out.println();
	}

	private void peek() {
		if(empty()) {
			System.out.println("Queue Under Flow");
			return;
		}
		System.out.println("Queue Peek Value..."+ arr[front]);
	}

	private void deque() {
		if(empty()) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println("Deque value: "+ arr[front]);
		front = (front + 1) % capacity;
		count--;
		
	}

	private boolean empty() {
		if(count == 0) {
			return true;
		}
		return false;
	}

	private void enque(int data) {
		if(isFull()) {
			System.out.println("queue Overflow...");
			return;
		}
		rear = (rear+1) % capacity;
		arr[rear] = data;
		count++;
		
	}

	private boolean isFull() {
		if(count == capacity) {
			return true;
		}
		return false;
	}

}
