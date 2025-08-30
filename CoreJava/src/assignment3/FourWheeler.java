package assignment3;

public class FourWheeler extends Vehicle {
	public FourWheeler(int regNo, String companyName, String model, int price) {
		super(regNo, companyName,model,price);
	}
	
	@Override
	public double calculateInsurance() {
		return this.price*0.1;
	}
}
