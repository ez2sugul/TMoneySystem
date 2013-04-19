package com.tdd.day2;

public abstract class Passenger {
	private Point start;
	private double fee;
	
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	private Point end;
	private Vehicle vehicle;
	
	public double calcFee() {
		return this.fee + vehicle.getDistanceFee(start.getDistance(end));
	}
	
}
