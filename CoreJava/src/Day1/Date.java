package Day1;

public class Date {
	
	private int day;
	private String month;
	private int year;
	
	public Date()
	{
		//	day =1; 
		//	month = "jan";
		//	year = 2025;
		this(1, "Jan", 2025);
	}
	
	public Date(int day, String month, int year) {
		this.day= day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return "Date: " + day + "/" + month + "/" + year;
	}
	

}
