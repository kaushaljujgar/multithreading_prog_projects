package com.jspiders.multithreading.main;
import com.jspiders.multithreading.properties.threads.*;
public class ThreadMain3 {
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.setName("T2");
		thread.setPriority(2);
		thread.start();

	}
	
	
	

}
