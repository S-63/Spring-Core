//SeasonFinder.java
package com.nt.sbeans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("sf")
@Component
public class SeasonFinder {
	@Autowired   // Field Injection
	
	private  Calendar cal;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param constructor");
	}
	
	//b.method
	public  String  findSeason(String user) {
		//get current month 
		int month=cal.get(Calendar.MONTH); //gives 0 to 11
		//generate season nname
		if(month>=2 && month<=5)
			return "Welcome to Summer Season ::"+user;
		else if(month>=6 && month<=9)
			return "Welcome to Rainy Season ::"+user;
		else
			return "Welcome to Winter Season ::"+user;
	}

}
