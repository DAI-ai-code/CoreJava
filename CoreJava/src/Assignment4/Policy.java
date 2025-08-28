package Assignment4;

import Assignment3.Vehicle;

public class Policy {
	public static void getPolicy(Vehicle v) {
		
		System.out.println("Insurance amount of your vehicle is Rs. " + v.calculateInsurance());
		
	}
}
