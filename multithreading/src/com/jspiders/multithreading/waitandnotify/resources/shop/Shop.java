package com.jspiders.multithreading.waitandnotify.resources.shop;
public class Shop {
	 int noOfProducts; 

	public Shop(int noOfProducts) {
		super();
		this.noOfProducts = noOfProducts;
	}                                             
	
	public synchronized void restockProducts(int restockProducts) {
		noOfProducts+=restockProducts; 
		System.out.println(restockProducts+" Succesfully Added To The Stock.");
	System.out.println("Now Availaible Products Are: "+noOfProducts);
	this.notify();
	}
	
	                                                  
	public synchronized  void purchaseProducts(int purchaseProducts) {
		if (purchaseProducts<noOfProducts) {
			System.out.println(purchaseProducts+" Not Availaible Please Wait");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			noOfProducts-=purchaseProducts;  
			System.out.println(purchaseProducts+" Succesfully Purchased");
			System.out.println("Now Availaible Products Are: "+noOfProducts);
			                                                     
		}
		
	}

}
