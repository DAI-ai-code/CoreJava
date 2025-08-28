package Assignment1;

public class Student {

	private String name;
	private int roll_no;
	
	public Student() {//default
		name = "User not created!";
		roll_no = 0;
	}
	
	public Student(String name, int roll_no) {//parameterized
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public Student(String name) {
		this.name = name;
		this.roll_no = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	
	public String toString() {
		return "Name of student is " + name + " and roll number is: " + roll_no;
	}
}
