package Assignment4;

import Assignment3.FourWheeler;
import Assignment3.TwoWheeler;
import Assignment3.Vehicle;

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
