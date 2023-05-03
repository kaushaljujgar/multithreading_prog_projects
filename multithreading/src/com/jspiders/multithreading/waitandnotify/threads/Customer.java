package com.jspiders.multithreading.waitandnotify.threads;
import com.jspiders.multithreading.waitandnotify.resources.shop.*;
public class Customer extends Thread {
	private int noOfProducts;
	private Shop shop;
	
	public Customer(Shop shop, int noOfProducts) {
		super();
		this.noOfProducts = noOfProducts;
		this.shop=shop;
	}
	@Override
	public void run() {
		shop.purchaseProducts(noOfProducts);
			
		}
		
	}


