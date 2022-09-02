package kr.co.ezenac.decision;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int age = scan.nextInt();
		
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
