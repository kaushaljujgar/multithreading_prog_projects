package com.jspiders.multithreading.waitandnotify.threads;
import com.jspiders.multithreading.waitandnotify.resources.shop.*;
public class Supplier extends Thread {
	private Shop shop;
	private int noOfProducts;

	public Supplier(Shop shop,int noOfProducts) {
		this.shop=shop;
		this.noOfProducts = noOfProducts;
	}
	@Override
	public void run() {
		shop.restockProducts(noOfProducts);
		
	}
	
	
	

}
