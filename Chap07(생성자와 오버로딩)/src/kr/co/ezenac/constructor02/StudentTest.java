package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {
		//기본생성자 호출
		Student student = new Student();
		//System.out.println(student.getAge());
		System.out.println(student.toString());

		System.out.println();
		//매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		
		System.out.println();
		//String만 있는 생성자
		Student student3 = new Student("이순신");
		System.out.println(student3);
		
		System.out.println();
		//int만 있는 생성자
		Student student4 = new Student(30);
		System.out.println(student4);
		
		
	}

}
