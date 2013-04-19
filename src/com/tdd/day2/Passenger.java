package com.tdd.day2;

import java.util.ArrayList;

public abstract class Passenger {
//	private Point start;
	private double fee;
	
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public ArrayList getVehicle() {
		return vehicles;
	}

	public void setVehicle(ArrayList vehicle) {
		this.vehicles = vehicle;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	private Point end;
	private ArrayList vehicles = new ArrayList();
	
	public double calcFee() {
		double totalFee = 0.0;
		for (int i = 0; i < this.vehicles.size(); i++) {
			totalFee += ((Vehicle)this.vehicles.get(i)).getDistanceFee();
		}
		return totalFee + this.getFee();
	}
	
}
