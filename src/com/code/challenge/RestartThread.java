package com.code.challenge;

import java.lang.Thread.UncaughtExceptionHandler;

public class RestartThread {

	public static void main(String[] args) {
		Task t = new Task();
		Thread thread = new Thread(t);
		thread.start();
	}

}

class Task implements Runnable{

	@Override
	public void run() {
		
		Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandle());
		System.out.println("Current thread..."+Thread.currentThread().getId());
		
		System.out.println(Integer.parseInt("122"));
		
		System.out.println(Integer.parseInt("xyz"));
		
		System.out.println(Integer.parseInt("576"));
		
		System.out.println("---------------------------");
		
	}
	
}

class ExceptionHandle implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.printf("An exception has been captured\n");
		System.out.printf("Thread: %s\n", t.getId());
	    System.out.printf("Exception: %s: %s\n", e.getClass().getName(), e.getMessage());
	    new Thread(new Task()).start();
	}
	
}
