package labwork;

import java.time.LocalDate;

public class Student {
	
	private String prn, name, city;
	private Course course;
	private int age;
	private double gpa;
	private LocalDate enrollmentDate;
	
	public Student(String prn, String name, String course, String city, int age, double gpa, LocalDate enrollmentDate) {
		
		this.prn = prn;
		this.name = name;
		this.course = Course.valueOf(course);
		this.city = city;
		this.age = age;
		this.gpa = gpa;
		this.enrollmentDate = enrollmentDate;
	}
	
	public String getprn() {
		return prn;
	}
	
	public void setprn(String prn) {
		this.prn = prn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	@Override
	public String toString() {
		return "Student : prn=" + prn + ", name=" + name + ", course=" + course + ", city=" + city + ", age=" + age
				+ ", gpa=" + gpa + ", enrollmentDate=" + enrollmentDate;
	}
	

}
