package com.katerina.Task1.cars;

public abstract class Car {
	private String carName;
	
	public String name(){
		return this.carName;
		} 
		
	protected Car(String name){
		this.carName=name;
	}
	}