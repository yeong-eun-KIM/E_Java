package kr.co.ezenac.decision02;

import java.util.Scanner;

public class IfElseIfElse03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		//validation : score 변수의 값에 따라서 조건문 분기가 일어나야함.
		//정확한 값 범위를 사용하겠다는 것이고
		//값의 범위가 연속접이지 않고 띄엄띄엄 있을 때 사용.
		
		
		if (score >= 90 && score <=100) {
			System.out.println("등급은 A입니다.");
		}
		else if (score >=80 && score <90) {
			System.out.println("등급은 B입니다.");
		}
		else if (score >=70 && score <80) {
			System.out.println("등급은 C입니다.");
		}
		else if (score >=60 && score <70) {
			System.out.println("등급은 D입니다.");
		}
		else if (score >=0 && score < 60) {
			System.out.println("등급은 F입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("==============================================");
		
		if (score >=0 && score <=100) {
			if (score >= 90)
				System.out.println("A");
			else if (score >=80)
				System.out.println("B");
			else if (score >=70)
				System.out.println("C");
			else if (score >=60)
				System.out.println("D");
			else {
				System.out.println("F");
			}			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
				
		scan.close();

	}

}
