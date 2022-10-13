package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		// create IOC container
		  ClassPathXmlApplicationContext ctx=
				    new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  //get Target spring bean class object
		  Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		  //invoke the b.methods
		  String result=fpkt.shopping(new String[] {"shirt","trouser","shoe"},
				                                         new double[] {1000.0, 3000.0, 5000.0});
		  System.out.println(result);
		  
		  //close container
		  ctx.close();

	}

}
