package assignment2;

public class Student {
	private static int id = 0;
	private static int maxMarks = 120;
	private int rollno;
	private String name;
	private int[] marks;
	
	public Student(String name, int ...marks) {
		this.rollno = ++id;
		this.name = name;
		this.marks = marks;
	}
	
	public double average(int ...marks) {
		int sum = 0;
		for(int i: marks) {
			sum += i;
		}
		
		return sum/marks.length;
	}
	
	public double percentage(double avg) {
		return avg*100/maxMarks;
	}	
	
	public String toString() {
		return "Student with name =  " + name +" and rollno = " + rollno;
	}
}
