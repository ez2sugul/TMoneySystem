package com.tdd.day2;

public class Subway implements Vehicle {

	@Override
	public double getDistanceFee(double distance) {
		
		/**
		 * 
		 * 
		 */
		
		int distancePer;
		if (distance >= 10 && distance < 40) {
			distancePer = (int) (distance - 10) / 5;
			return distancePer * 100;
		} else if (distance >= 40) {
			distancePer = (int) (distance - 40) / 10;
			return distancePer * 100 + 600;
		}
		return 0;
	}

}
