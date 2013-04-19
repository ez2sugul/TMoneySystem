package com.tdd.day2;

public class Bus_Town extends Vehicle {
	
	public Bus_Town(Passenger passenger) {
		if(passenger.getFee() > 750) return;
		passenger.setFee(750);
	}
	

	@Override
	public double getDistanceFee() {
		return 0;
	}

}
