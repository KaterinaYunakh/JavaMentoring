package com.katerina.Task1.drivers;

import com.katerina.Task1.cars.LightweightCar;

public class CarDriver{
	
	protected String driverName = "CarDriver";
	
	public void drive(LightweightCar lCar){
		System.out.println(driverName + ":: Driving " + lCar.name());	
	}
}