package com.tdd.day2;

public class Bus_Metro extends Vehicle {
	
	public Bus_Metro(Passenger passenger) {
		passenger.setFee(1700);
	}

	@Override
	public double getDistanceFee() { 
		return 0;
	}

}
