package assignment3;

public abstract class Vehicle {
	protected int regNo;
	protected String companyName, model;
	protected int price;
	
	public Vehicle(int regNo, String companyName, String model, int price) {
		this.regNo = regNo;
		this.companyName = companyName;
		this.model = model;
		this.price = price;
	}
	
	public abstract double calculateInsurance();
	
	public String displayVehicle() {
		return "Registration Number: "+this.regNo+"\nCompnay Name: "+this.companyName+"\nModel: "+this.model+"\nPrice: $"+this.price+"\n";
	}
	
}
