package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private int studentId;
	private Subject majorSubject;
	private ArrayList<Score> scores = new ArrayList<>();
	
	public Student(String studentName, int studentId, Subject majorSubject) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public ArrayList<Score> getScores() {
		return scores;
	}

	public void addSubjectScores(Score score) {
		scores.add(score);
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	
}
