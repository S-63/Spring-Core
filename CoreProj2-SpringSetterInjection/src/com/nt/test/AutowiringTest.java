//AutowiringTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		 //create IOC container
		 //FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 
			/*FileSystemXmlApplicationContext ctx= 
					 new FileSystemXmlApplicationContext("E:\\Worskpaces\\Spring\\FS-NTSP63\\CoreProj2-SpringSetterInjection\\src\\com\\nt\\cfgs\\applicationContext.xml");
			*/
		   
			/*ClassPathXmlApplicationContext ctx=
				   new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");*/
		
		ClassPathXmlApplicationContext ctx=
				   new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get Target spring bean class obj
		 Object obj=ctx.getBean("wmg");
	
		 //typcasting 
		 WishMessageGenerator generator=(WishMessageGenerator)obj;
		 //invoke the b.method
		   String result=generator.generateWishMessage("raja");
		   System.out.println(result);
		   //close  IOC container
		   ctx.close();
	}

}
