//App1.java
package com.nt.test;

import java.util.Arrays;

public class App1 implements java.io.Serializable{
	
	public static void main(String[] args) {
		
		Class c1=App1.class;
		System.out.println("c1 obj class name::"+c1.getClass());  //gives java.lang.Class
 		System.out.println("c1 obj data ::"+c1.toString()); //gives  App1
		System.out.println("c1 obj' data class name::"+c1.getName());  //gives App1
		System.out.println("c1 obj's data class super class name::"+c1.getSuperclass()); // java.lang.Object
		System.out.println("c1 obj's data class list of implemented interfaces::"+Arrays.toString(c1.getInterfaces())); // [] no  interfaces are implemented App1
		System.out.println("c1 obj's data class list of methods::"+ Arrays.toString(c1.getDeclaredMethods()));  //  gives methods of App1 ( main1(-))
		System.out.println("==============================");
		Class c2=System.class;
		System.out.println("c2 obj class name::"+c2.getClass());  //gives java.lang.Class
 		System.out.println("c2 obj data ::"+c2.toString()); //gives java.lang.System
		System.out.println("c2 obj' data class name::"+c2.getName());  //gives java.langSystem
		System.out.println("c2 obj's data class super class name::"+c2.getSuperclass()); // java.lang.Object
		System.out.println("c2 obj's data class list of implemented interfaces::"+Arrays.toString(c2.getInterfaces())); //gives interfaces impl by System
		System.out.println("c2 obj's data class list of methods::"+ Arrays.toString(c2.getDeclaredMethods()));  //gives methods of System class
		
		
	}

}
