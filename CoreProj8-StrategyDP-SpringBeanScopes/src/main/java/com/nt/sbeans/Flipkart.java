//Flipkart.java (target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
@Scope("singleton")
public final class Flipkart {
	// HAS-A propoerty of Interface Type
	@Autowired
	@Qualifier("fFlight")
	private   Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
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
