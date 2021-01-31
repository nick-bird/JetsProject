package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	private boolean cargoIsLoaded = false;
	private String type = "Cargo";
	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean loadCargo() {

		return false;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
