package com.tdd.day2;

public class Bus extends Vehicle {
	
	public Bus() {
		this.setStart(new Point(0, 0));
		this.setEnd(new Point(0, 0));
	}
	
	public Bus(Point start, Point end) {
		this.setStart(start);
		this.setEnd(end);
	}

	@Override
	public double getDistanceFee() {
		int distancePer;
		int distance = (int) this.getStart().getDistance(this.getEnd());
		
		if (distance >= 10) {
			distancePer = (int) (distance - 10) / 5;
			return distancePer * 100;
		} 
		return 0;
	}

}
