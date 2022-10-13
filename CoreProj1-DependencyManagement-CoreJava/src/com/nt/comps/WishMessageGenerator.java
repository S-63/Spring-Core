//WishMessageGenerator.java (target class)
package com.nt.comps;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	 //HAS -A property
	private LocalDateTime ldt;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	//setter Metthod in support for Dependency Management
	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt(-)");
		this.ldt=ldt;
	}
	
	//b.method  using the Injected/assigned Depedent class obj
	public  String  generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage(-)");
		//get current hour of day
		int hour=ldt.getHour();
		//generate wishMesage
		 if(hour<12)
			 return "Good Morning::"+user;
		 else if(hour<16)
			 return "Good afternoon::"+user;
		 else if(hour<20)
			 return "Good evening::"+user;
		 else
			 return "Good Night ::"+user;
	}

}
