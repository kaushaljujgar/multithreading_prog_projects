package com.jspiders.multithreading.properties.threads;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("The Name Of The Current Thread is:"+Thread.currentThread().getName());
		System.out.println("The Priority Of Thread Is:"+Thread.currentThread().getPriority());
		
	}

}
