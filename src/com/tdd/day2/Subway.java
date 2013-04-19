package com.tdd.day2;

public class Subway extends Vehicle {
	
	public Subway() {
		this.setStart(new Point(0, 0));
		this.setEnd(new Point(0, 0));
	}
	
	public Subway(Point start, Point end) {
		this.setStart(start);
		this.setEnd(end);
	}

	@Override
	public double getDistanceFee() {
		int distancePer;
		int distance = (int) this.getStart().getDistance(this.getEnd());
		
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
