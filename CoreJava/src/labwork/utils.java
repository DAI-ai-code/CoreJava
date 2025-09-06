package labwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class utils {
	
	public List<String> getStudentNamesByCourse(List<Student> students, String course){
		List<String> names = new ArrayList<>();
		Stream<Student> stream = students.stream();
		names = stream.filter((s) -> s.getCourse() == Course.valueOf(course)).map(Student::getName).collect(Collectors.toList());
		return names;
	}
	
	public List<Student> getStudentsWithHighGPA(List<Student> students, double minGPA){
		
		return students.stream().filter((s) -> s.getGpa() > minGPA).collect(Collectors.toList());
	}
	
	public Set<String> getAllCities(List<Student> students){
		return students.stream().map(Student::getCity).collect(Collectors.toSet());
	}
	
	public Map<Course, Long> getStudentCountByCourse(List<Student> students){
		return students.stream().collect(Collectors.groupingBy(Student::getCourse, Collectors.counting()));
	}
	
	public double getAverageGPA(List<Student> students) {
		return students.stream().mapToDouble(Student::getGpa).average().orElse(0.0);
	}
	
	public List<Student> getTopStudentsByGPA(List<Student> students, int limit){
		return students.stream().sorted((s1, s2)-> Double.compare(s2.getGpa(), s1.getGpa())).limit(limit).collect(Collectors.toList());
	}
	
	public List<Student> getStudentsSortedByName(List<Student> students){
		return students.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
	}
	
	public Map<Integer, List<Student>> getStudentsByEnrollmentYear(List<Student> students){
		return students.stream().collect(Collectors.groupingBy((s) -> s.getEnrollmentDate().getYear()));
	
	} 
}
