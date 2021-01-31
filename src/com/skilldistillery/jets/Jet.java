package com.skilldistillery.jets;

public abstract class Jet {
//model, speed, range, price
	private String model;
	private double Speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		Speed = speed;
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
		return Speed;
	}

	public void setSpeed(double speed) {
		Speed = speed;
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