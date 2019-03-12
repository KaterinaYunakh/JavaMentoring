package com.katerina.Task1.drivers;

import com.katerina.Task1.cars.LightweightCar;
import com.katerina.Task1.cars.HeavyCar;
import com.katerina.Task1.cars.Car;

public class TruckDriver{
	protected String driverName = "TruckDriver";
	
	public <T extends Car> void drive(T car){
		System.out.println(driverName + ":: Driving " + car.name());	
	}
	
	public void loadCargo(HeavyCar hCar){
		System.out.println(driverName + ":: Loading cargo into truck with capacity "+ hCar.getCargoCapacity() + " tons");	
	}
}
