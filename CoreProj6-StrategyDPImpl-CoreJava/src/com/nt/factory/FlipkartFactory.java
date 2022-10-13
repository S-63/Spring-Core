//FlipkartFactory.java
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.FirstFlight;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	//public static factory method
	public static   Flipkart  getInstance(String courierType) {
		System.out.println("FlipkartFactory.getInstance()");
		 //Depedent class obj
		  Courier courier=null;
		  if(courierType.equalsIgnoreCase("dhl"))
			   courier=new DHL();
		  else if(courierType.equalsIgnoreCase("bDart"))
			   courier=new BlueDart();
		  else if(courierType.equalsIgnoreCase("firstFlight"))
			    courier=new FirstFlight();
		  else
			  throw new IllegalArgumentException("Invalid  Courier type");
		  //create target class object
		    Flipkart fpkt=new Flipkart();
		    //set Depenent class obj to Target class obj
		    fpkt.setCourier(courier);
		    return fpkt;
		  
	}
}
