package com.jspiders.multithreading.properties.threads;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		
		System.out.println("The Name Of The Thread Is:"+getName());
		System.out.println("The Priority Of The Thread Is:"+getPriority());
	}

}
