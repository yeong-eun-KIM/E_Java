package kr.co.ezenac.arraylist02;

/*
 * Ezen 학원에 학생이3명 있습니다
 * 각 학생마다 읽은 책을 기록하고 있습니다.
 * 학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다.
 * 다음과 같이 출력되게 클래스를 만들어서 실행하시오.
 * Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 * Shin 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 * kim 학생이 읽은 책은 : 머신러닝1~6입니다.
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student L = new Student("Lee");
		L.readbook("운영체제1");
		L.readbook("운영체제2");
		
		Student S = new Student("Shin");
		S.readbook("딥러닝1");
		S.readbook("딥러닝2");
		S.readbook("딥러닝3");
		
		Student K = new Student("Kim");
		K.readbook("머신러닝1");
		K.readbook("머신러닝2");
		K.readbook("머신러닝3");
		K.readbook("머신러닝4");
		K.readbook("머신러닝5");
		K.readbook("머신러닝6");
		
		
		L.showInfo();
		S.showInfo();
		K.showInfo();
	}

}
