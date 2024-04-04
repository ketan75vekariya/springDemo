package org.springdemo.engine;

import org.springdemo.carInterface.Engine;


public class EngineType implements Engine{

	String type;
	
	
	public EngineType() {
		type = "unknown";
	}


	public EngineType(String type) {
		super();
		this.type = type;
	}


	@Override
	public String type() {
		// TODO Auto-generated method stub
		return type;
	}

}
