package kr.co.ezenac.arraylist;

/*
 * 학생이 수강한 과목 학점 출력하시오.
 * 학생 - 2022학번 Lee  2021학번 Shin
 * Lee - 국어, 수학 수강
 * Shin - 국어, 수학, 영어 수강
 * 
 * Lee - 100, 70
 * Shin - 70, 90, 100
 * 
 * ArrayList를 활용하여 두 학생의 과목 성적과 총점을 구하시오.
 */

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentL = new Student(2022, "Lee");
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 70);
		
		Student studentS = new Student(2021, "Shin");
		studentS.addSubject("국어", 70);
		studentS.addSubject("수학", 90);
		studentS.addSubject("영어", 100);
		
		studentL.showInfo();
		System.out.println();
		studentS.showInfo();
		
		
	}
}
