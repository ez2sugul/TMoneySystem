package com.tdd.day2;

public class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getDistance(Point p2){
		double d = 0;

		d = Math.sqrt(Math.pow(p2.getY() - getY(), 2) + Math.pow(p2.getX() - getX(), 2)); 
		return d;
	}
}
