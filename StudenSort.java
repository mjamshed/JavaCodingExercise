package javacodingexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(1, "Tina", 3.68));
		studentList.add(new Student(2, "Louis", 3.85));
		studentList.add(new Student(3, "Samar", 3.75));
		studentList.add(new Student(4, "Samar", 3.75));
		studentList.add(new Student(5, "Lorry", 3.76));
		Collections.sort(studentList, new Student());
		for (Student a : studentList)
			System.out.println(a.getId() + ": " + a.getName());
	}
}
