package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentExample {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1,"홍길동"));
		students.add(new Student(2,"일지매"));
		students.add(new Student(1,"임꺽정"));

		
		Iterator<Student> iterator = students.iterator();
		
		while(iterator.hasNext()){
		
			Student student = iterator.next();
			System.out.println(student.StudentNum+":"+student.name);
		}
		
		
	}
}
