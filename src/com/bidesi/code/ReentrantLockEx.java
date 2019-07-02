package com.bidesi.code;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {

	public static void main(String[] args) {
		ReentrantLock reentrantLock = new ReentrantLock();
		Thread t1 = new Thread(new Printer("Thread-1", reentrantLock));
		Thread t2 = new Thread(new Printer("Thread-2", reentrantLock));
		
		t1.start();
		t2.start();
	}

}

class Printer implements Runnable {

	private String threadName;
	private ReentrantLock reentrantLock;

	public Printer(String threadName, ReentrantLock reentrantLock) {
		this.threadName = threadName;
		this.reentrantLock = reentrantLock;
	}

	@Override
	public void run() {
		
		System.out.println("Thread : " +threadName +" is waiting to get lock...");
		reentrantLock.lock();
		try {
			System.out.println("Thread: "+ threadName +" acquired lock ");
			getA();
		}finally {
			reentrantLock.unlock();
			System.out.println("Thread :"+ threadName +" released the lock and the lock held count is.."+ reentrantLock.getHoldCount());
		}
	}

	private void getA() {
		System.out.println("getA() thread: "+ threadName + " is waiting for lock");
		try {
			reentrantLock.lock();
			System.out.println("getA(): "+ threadName +" acquired lock, with count.."+ reentrantLock.getHoldCount());
		}finally {
			reentrantLock.unlock();
			System.out.println("getA() thread name: "+threadName +" released lock..held threadcount.."+ reentrantLock.getHoldCount());;
		}
		
	}
	
}
