package org.springdemo.engine;

import org.springdemo.carInterface.Engine;
import org.springframework.stereotype.Component;
@Component("v8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "V8";
	}

}
