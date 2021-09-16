package com.thread;

public class Car {

	String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		
		Car i=(Car) obj;
		
		
		return this.name.equals(i.name);
	}
	
	
	
}
