package Assignment3;
import java.util.Scanner;

public class ServiceCenter {

	public static void main(String[] args) {
		
		TwoWheeler bajaj = new TwoWheeler(1, "Bajaj", "ABC", 500);
		FourWheeler BMW = new FourWheeler(2,"BMW", "M5-Competition",100000);
		double bajajIns = bajaj.calculateInsurance();
		double BMWIns = BMW.calculateInsurance();
		System.out.println(bajaj.displayVehicle() +"Insurance: " +bajajIns + "\n"); 
		System.out.println(BMW.displayVehicle() +"Insurance: "+ BMWIns + "\n");

	}

}
