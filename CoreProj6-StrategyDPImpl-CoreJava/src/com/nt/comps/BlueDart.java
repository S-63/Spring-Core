//BlueDart.java (dependent class1)
package com.nt.comps;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+" order id order products  are given  for delivery to  BlueDart Courier Service";
	}

}
