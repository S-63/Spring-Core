//PersonInfo.java (spring bean class)
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")  // cfg of java calss as spring bean
@PropertySource("com/nt/commons/info.properties") //cfg of properites file
public class PersonInfo {
	@Value("${per.name}")
	private  String  pname;
	@Value("${per.addrs}")
	private  String paddrs;
	@Value("${per.age}")
	private   int  page;
	
	//toString (alt+shift+s,s)
	@Override
	public String toString() {
		return "PersonInfo [pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + "]";
	}
}
