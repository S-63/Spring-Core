//FirstFliht.java (dependent class3)
package com.nt.comps;

public final class FirstFlight implements Courier {
	
	public FirstFlight() {
		System.out.println("FirstFlight:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return oid+" order id order products  are given  for delivery to  FirstFlight Courier Service";
	}

}
