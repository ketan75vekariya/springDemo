package org.springdemo.engine;

import org.springdemo.carInterface.Engine;
import org.springframework.stereotype.Component;
@Component("v6Engine")
public class V6 implements Engine{

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "V6";
	}

}
