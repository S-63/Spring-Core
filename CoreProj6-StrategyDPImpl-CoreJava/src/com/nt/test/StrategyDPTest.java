
//StrategyDPTest.java (Client app)
package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		 //get Target class object
		 Flipkart fpkt=FlipkartFactory.getInstance("dhl");
		 //invoke the method
		 String msg=fpkt.shopping(new String[] {"shirt","shoe","dhoti"},
				                                      new double[] {3000.0, 6000.0,2000.0}
		                                             );
		 System.out.println(msg);

	}

}
