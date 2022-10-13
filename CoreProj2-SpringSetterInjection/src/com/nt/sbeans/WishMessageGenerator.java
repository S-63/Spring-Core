//WishMessageGenerator.java (target class)
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")  //To cfg java class as spring bean
public class WishMessageGenerator {
	//HAS - A property
	@Autowired   //Field Injection
	private LocalDateTime ldt;
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	/*	@Autowired
		@Qualifier("dt1")
			public void  assign(LocalDateTime ldt) {
				System.out.println("WishMessageGenerator.assign()");
				this.ldt=ldt;
			}*/
	
	/*	@Autowired
		
		public   WishMessageGenerator(@Qualifier("dt1") LocalDateTime ldt) {
			System.out.println("WishMessageGenerator:1 -param constructor");
			this.ldt=ldt;
		}*/
	
	/*		@Autowired  //  for setter Injection
			public void  setLdt(LocalDateTime ldt) {
				System.out.println("WishMessageGenerator.setLdt()");
				this.ldt=ldt;
			}*/
	
	// B.method
	public  String  generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()::"+ldt);
		 //get current hour of the day
		 int hour=ldt.getHour();
		 //generate wish Message
		  if(hour<12)
			  return "Good Morning::"+user;
		  else if(hour<16)
			  return "Good Afternoon::"+user;
		  else  if(hour<20)
			  return "Good Evening ::"+user;
		  else
			  return "Good Night ::"+user;
	}
	

}
