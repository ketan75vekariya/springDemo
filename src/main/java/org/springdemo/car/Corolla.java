package org.springdemo.car;

import org.springdemo.carInterface.Car;
import org.springdemo.carInterface.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//This class is use for all the function which abstracted from interface
@Component("corolla")
// This notation help to find functions t framework 
public class Corolla implements Car {
	
	//Due to Autowired i don't need to create object of Engine Class and we can easily access data of engine class
	@Autowired
	@Qualifier("v6Engine")
	//Qualifier access the class with the same name of give 
	Engine engine;

	@Override
	public void spece() {
		System.out.println("Sedan from Toyota with engine " + engine.type());

	}

}
