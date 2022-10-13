//Customer.java
package com.nt.comps;

import java.util.Random;

public class Customer implements Person {
	
	public Customer() {
		System.out.println("Customer: 0-param constructor");
	}

	@Override
	public void doTask() {
		System.out.println("Student is  Purchasing products of price::"+new Random().nextInt(1000));
	}

}
