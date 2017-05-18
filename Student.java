package javacodingexercise;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {

	private String name;
	private int id;
	private double gpa;

	Student(int id, String name, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		System.out.println((this.name) + (stud.name));
		System.out.println("am here " + (this.name).compareTo(stud.name));
		return (this.name).compareTo(stud.name);
	}

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		if (stud1.getGpa() == stud2.getGpa())
			if (stud1.getName() == stud2.getName())
				return stud1.getId() - stud2.getId();
			else
				return stud1.getName().compareTo(stud2.getName());
		if (stud1.getGpa() < stud2.getGpa())
			return 1;
		if (stud1.getGpa() > stud2.getGpa())
			return -1;
		return 0;
	}

}
