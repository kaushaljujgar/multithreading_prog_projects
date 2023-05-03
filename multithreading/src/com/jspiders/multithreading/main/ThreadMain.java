package com.jspiders.multithreading.main;  //First Way Of Thread Creation By Extending Thread Class.
import com.jspiders.multithreading.threads.*;
public class ThreadMain {
	public static void main(String[] args) {
		Mythread1 myThread1=new Mythread1();
		myThread1.start();
	}
}
