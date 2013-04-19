package com.tdd.day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PassengerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdultDefaultFee() throws Exception {
		//Given
		Passenger adult = new Adult();
		
		//When
		adult.setStart(new Point(0, 0));
		adult.setEnd(new Point(0, 10));
		adult.setVehicle(new Bus());
		double fee = adult.calcFee();
		//Then
		
		assertEquals(900, fee, 0);
	}
	
	@Test
	public void testAdultExtraFee() throws Exception {
		//Given
		Passenger adult = new Adult();

		//When
		adult.setStart(new Point(0, 0));
		adult.setEnd(new Point(0, 30));
		adult.setVehicle(new Subway());
		double fee = adult.calcFee();
		//Then
		assertEquals(1300, fee, 0);
	}
	
	@Test
	public void testYoungAdultDefaultFee() throws Exception {
		//Given
		Passenger young = new YoungAdult();

		//When
		young.setStart(new Point(0, 0));
		young.setEnd(new Point(0, 10));
		young.setVehicle(new Subway());
		double fee = young.calcFee();
		//Then
		assertEquals(720, fee, 0);
	}
	
	@Test
	public void testYoungAdultExtraFee() throws Exception {
		//Given
		Passenger young = new YoungAdult();

		//When
		young.setStart(new Point(0, 0));
		young.setEnd(new Point(0, 30));
		young.setVehicle(new Subway());
		double fee = young.calcFee();
		//Then
		assertEquals(1300, fee, 0);
	}
	
	@Test
	public void testTransportAdult() throws Exception {
		//Given
		Passenger adult = new Adult();
		//When
		//Then
	}

}
