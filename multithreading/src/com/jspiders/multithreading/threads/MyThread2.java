package com.jspiders.multithreading.threads;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			System.out.println("Thread 2 Is Now Running.");
		}
		
	}
	

}
