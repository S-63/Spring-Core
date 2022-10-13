//Flipkart.java (target class)
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	// HAS-A propoerty of Interface Type
	private   Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method  to assign Depedent class obj to target class obj 
	public  void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	//b.method
	public   String   shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		//calc bill  amount
		double billAmt=0.0;
		for(double price:prices) {
			billAmt=billAmt+price;
		}//for
		// generate the order id
		 int oid=new Random().nextInt(10000);
		 // set the Courier for delivery
		 String deliveryMsg=courier.deliver(oid);
		 
		 // display shopping details
		 return  Arrays.toString(items)+ " are purchased haviv bill amount::"+billAmt+"...."+deliveryMsg;
		
	}//method

}//class
