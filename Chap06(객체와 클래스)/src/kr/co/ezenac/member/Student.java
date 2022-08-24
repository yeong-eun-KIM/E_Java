package kr.co.ezenac.member;


/*
 *  1. 클래스는 대문자로 시작함
 *  2. java 파일 하나에 여러 개가 있을 수 있음.
 *   - public 클래스는 하나임
 *   - public 클래스와 .java 파일의 이름은 동일함.
 */
public class Student {
	
	int studentId;
	String studentName;
	String studentAddress;
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + studentAddress);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
