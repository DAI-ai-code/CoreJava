package Day1;
import java.util.Scanner;

public class Course {
	
	private String name;
	private int size;
	
	public Course(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of courses: ");
		int num_courses = sc.nextInt();
		
		Course courses[] = new Course[num_courses];
		
		String name;
		int size;
		
		for(int i=0; i<num_courses; i++) {
			System.out.println("Enter course name: ");
			name = sc.next();
			System.out.println("Enter batch size: ");
			size = sc.nextInt();
			
			courses[i] = new Course(name, size);
		}
		
		for(int i=0; i<num_courses; i++) {
			System.out.println("Course Name: " + courses[i].name + ", Batch Size: " + courses[i].size);
		}
	}
	
}
