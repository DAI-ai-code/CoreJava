package Assignment2;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of subjects");
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i=0; i<n; i++) {
		System.out.println("Enter marks for subject "+ (i+1));
		marks[i] = sc.nextInt();
		}
		
		Student s1 = new Student("Test", marks);
		System.out.println(s1);
	    double avg = s1.average(marks);
	    double percent = s1.percentage(avg);
	    System.out.println("Average is: "+avg + " and percentage is: " +percent + "%");
	    
	    Student s2 = new Student("Test2", marks);
	    System.out.println(s2);
	    
	}

}
