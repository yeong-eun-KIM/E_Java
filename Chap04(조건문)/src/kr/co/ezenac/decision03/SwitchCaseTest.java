package kr.co.ezenac.decision03;

import java.util.Scanner;

// 한달이 며칠인지 알려주는 프로그램



public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = scan.nextInt();
	
		switch(month) {
		case 2:
			System.out.println("28일까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지입니다.");
			break;
		default :
			System.out.println("31일까지입니다.");
			
		}		
		scan.close();
	}

}
