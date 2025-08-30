package assignment4;

import assignment3.FourWheeler;
import assignment3.TwoWheeler;
import assignment3.Vehicle;

public class VehicleLot {

	public static void main(String[] args) {
		Vehicle [] vehicles = new Vehicle[2];
		
		vehicles[0] = new TwoWheeler(4565, "Honda", "Activa 6G", 120000);
		vehicles[1] = new FourWheeler(5387, "Volkswagen", "Virtus", 1500000);
		
		for(Vehicle v : vehicles) {
			Policy.getPolicy(v);
			
		}
	}

}
