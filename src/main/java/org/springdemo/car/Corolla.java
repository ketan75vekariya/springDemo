package org.springdemo.car;

import org.springdemo.carInterface.Car;
import org.springframework.stereotype.Component;


//This class is use for all the function which abstracted from interface
@Component("corolla")
// This notation help to find functions t framework 
public class Corolla implements Car {

	@Override
	public void spece() {
		System.out.println("Sedan from Toyota");

	}

}
