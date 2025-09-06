package labwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Student s1 = new Student("1", "AA", "DAI", "BR", 20, 8.7, LocalDate.now());
		Student s2 = new Student("2", "BA", "DAI", "DL", 20, 7.7, LocalDate.now());
		Student s3 = new Student("3", "ABA", "DAC", "CH", 20, 8.3, LocalDate.of(2024,1,1));
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		utils u = new utils();
		List<String> name = u.getStudentNamesByCourse(students,"DAI");
		System.out.println(name);
		List<Student> highGpa = u.getStudentsWithHighGPA(students,8.0);
		System.out.println(highGpa);
		
		Set<String> cities = u.getAllCities(students);
		System.out.println(cities);
		
		Map<Integer, List<Student>> map = u.getStudentsByEnrollmentYear(students);
		System.out.println(map);
	}
}
