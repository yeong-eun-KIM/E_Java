package kr.co.ezenac.member;

public class StudentTest {
	
	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.studentName = "이순신";
		student1.studentAddress = "서울 강남구";
		
		student1.showStudentInfo();
		
		Student student2 = new Student();
		student2.studentName = "신사임당";
		student2.studentAddress = "인천 서구";
		
		student2.showStudentInfo();
		
		System.out.println(student1);
		System.out.println(student2);
		
	}
}
