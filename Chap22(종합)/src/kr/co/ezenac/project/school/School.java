package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class School {

	private static School instance = new School();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Subject> subjects = new ArrayList<>();

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
}
