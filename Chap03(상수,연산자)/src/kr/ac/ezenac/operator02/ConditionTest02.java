package kr.ac.ezenac.operator02;

import java.util.Scanner;

public class ConditionTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요.");
		int score = scan.nextInt();
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급 : " + grade);
		
		//상황연산자 중첩
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("당신의 등급 : " + grade);
		
		scan.close();
		
		
	}

}
