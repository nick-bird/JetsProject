package com.skilldistillery.jets;

public abstract class Jet {
//model, speed, range, price
	private String model;
	private Double speed;
	private Integer range;
	private Long price;
	private String type = null;

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

	public String getType() {
		return type;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
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
		flyTime = this.range / this.speed;
		System.out.println(this);
		System.out.printf("The " + this.model + " can fly for %.2f hours before running out of fuel\n", flyTime);
		System.out.println();
	}

	public void getSpeedInMach() {
		double machSpeed = this.speed / 767;
		System.out.printf("The " + this.model + " has a speed of Mach %.2f\n", machSpeed);
	}

	@Override
	public String toString() {
		return "Model: " + model + ", speed: " + speed + ", range: " + range + ", price: " + price;
	}

}
