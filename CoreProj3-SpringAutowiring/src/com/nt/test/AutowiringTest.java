//AutowiringTest.java
package com.nt.test;

import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class AutowiringTest {

	public static void main(String[] args) {
		 // create IOC container
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target spring bean class object from IOC container
		  //SeasonFinder finder=(SeasonFinder)ctx.getBean("sf");  //old -- not recomanded 
		 //SeasonFinder finder= ctx.getBean("sf",SeasonFinder.class); // new -- with generics --recomanded
		    SeasonFinder finder= ctx.getBean("seasonFinder",SeasonFinder.class);
		  //invoke the b.method
		  String result=finder.findSeason("raja");
		  System.out.println(result);
		  
		  System.out.println("===================");
		  Calendar cal=ctx.getBean("java.util.Calendar#0",Calendar.class);
		  System.out.println(cal);
		  
		  System.out.println("===================");
		  Calendar cal1=ctx.getBean("java.util.Calendar#1",Calendar.class);
		  System.out.println(cal);
		  

	}

}
