package com.jspiders.multithreading.main; //2nd way of thread creation by implementing runn interface.
import com.jspiders.multithreading.threads.*;
public class ThreadMain1 {
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();   
		Thread thread=new Thread(myThread2);  //Since We are not extending thread class we are not able to call start
		                                   //method directly hence we are creating object for thread class and passing the 
		                                  //our created obj to that thread class.
		thread.start();
	}
	

}
 