package com.skilldistillery.jets;

public abstract class Jet {
//model, speed, range, price
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.
		speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void fly() {
		double flyTime;
		flyTime = this.range  / this.speed; 
		System.out.printf("This aircraft can fly for %.2f hours before running out of fuel\n", flyTime);
	}
	public void getSpeedInMach() {
		double machSpeed = this.speed / 767;
		System.out.printf("This aircraft has a speed of Mach %.2f\n", machSpeed);
	}

	@Override
	public String toString() {
		return "Model: " + model + ", speed: " + speed + ", range: " + range + ", price: " + price;
	}
	
}

//constructor, and no arg,
// fly() + tostring
// some calculation with speed and range
//setters/getters 
// get speed in mach
// range 1500 miles 
// speed 400-600 
// mach speed  = divide speed by 767
// cargo (load cargo)/ charter (upgrade trim); 