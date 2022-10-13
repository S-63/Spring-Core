//Student.java
package com.nt.comps;

public class Student implements Person {
	
	 public Student() {
		System.out.println("STudent: 0-param constructor");
	}

	@Override
	public void doTask() {
		System.out.println("Student is  studying the engineering");
	}

}
