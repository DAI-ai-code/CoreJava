package Assignment1;
import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Agrim Jain", 4);
		Student s3 = new Student();
		s3.setName("Chirag Sharma");
		s3.setRoll_no(8);
		
		Student[] students = new Student[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			students[i] = new Student(sc.next());
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(students[i]);
		}
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3.getName() + " " + s3.getRoll_no());

		
	}

}
