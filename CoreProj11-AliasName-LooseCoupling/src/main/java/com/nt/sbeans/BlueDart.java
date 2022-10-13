//BlueDart.java (dependent class1)
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Lazy(true)
@Scope("prototype")
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
