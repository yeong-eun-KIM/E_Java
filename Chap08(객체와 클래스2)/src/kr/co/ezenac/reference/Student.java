package kr.co.ezenac.reference;

public class Student {
	
	int studentId;
	String studentName;
	
	//참조형 (또 다른 클래스를 멤버변수로 가짐)
	Subject korea;
	Subject math;
	
	public Student (int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject(); //객체생성 후 참조변수 초기화
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
		
	
}
