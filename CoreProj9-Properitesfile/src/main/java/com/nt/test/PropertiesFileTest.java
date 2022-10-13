//PropertiesFileTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class object
		PersonInfo info=ctx.getBean("per",PersonInfo.class);
		// dispay spring bean object data
		System.out.println(info);
		
		//close ApplicationContext container
		 ctx.close();

	}

}
