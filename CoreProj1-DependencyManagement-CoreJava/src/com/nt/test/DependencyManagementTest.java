//DependencyManagementTest.java
package com.nt.test;

import java.time.LocalDateTime;

import com.nt.comps.WishMessageGenerator;

public class DependencyManagementTest {

	public static void main(String[] args) {
         //create Target and Dependent classes objsS
		   LocalDateTime  sysDateTime= LocalDateTime.now(); //object for depedent class 
		   WishMessageGenerator generator=new WishMessageGenerator(); //obj for target class
		 //Assign Depedent class obj to target class object
		   generator.setLdt(sysDateTime);  //Depndency management
		  //invoke the b.method on target class obj
		   String result=generator.generateWishMessage("raja");
		   //display the result
		   System.out.println("Result::"+result);
		   
		   


	}//main

}//class
