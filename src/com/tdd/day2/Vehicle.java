package com.tdd.day2;

public abstract class Vehicle {
	private Point start;
	private Point end;
	
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public abstract double getDistanceFee();
}
