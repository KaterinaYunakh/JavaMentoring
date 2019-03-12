package com.katerina.Task1.cars;

public abstract class HeavyCar extends Car{
	
	private float cargoCapacity;
	
	public HeavyCar(String name, float cargoCapacity){
		super(name);
		this.cargoCapacity = cargoCapacity;
	}

	
	public float getCargoCapacity(){
		return cargoCapacity;	
	}
}