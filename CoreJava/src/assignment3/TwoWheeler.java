package assignment3;

public class TwoWheeler extends Vehicle{
	
	public TwoWheeler(int regNo, String companyName, String model, int price) {
		super(regNo, companyName, model, price);	
	}
	
	

	
	
	@Override
	public double calculateInsurance() {
		return this.price*0.05;
	}
}
