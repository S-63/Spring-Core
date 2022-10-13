//SpringI18nTest.java (Client App)
package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		//create IOC container
		 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 
		  //read inputs
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter language code");
		  String langcode=sc.next();
		  
		  System.out.println("Enter country code");
		  String countryCode=sc.next();
		  
		 // Prepare Locale object having language and Country
		  Locale locale=new Locale(langcode,countryCode);
		  
		  // get MEssage From Locale specific Properties file
		  String msg=ctx.getMessage("wish.message", new Object[] {}, locale);
		  System.out.println("Wish Message is ::"+msg);
		  
		  //close container
		  ctx.close();

	}

}
