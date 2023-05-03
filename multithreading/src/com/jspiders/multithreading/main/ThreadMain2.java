package com.jspiders.multithreading.main;
import com.jspiders.multithreading.properties.threads.*;
public class ThreadMain2 {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("T1");
		myThread1.setPriority(7);
		myThread1.start();
	}
	

}
