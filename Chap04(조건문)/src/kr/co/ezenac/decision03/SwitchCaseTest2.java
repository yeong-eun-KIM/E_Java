package kr.co.ezenac.decision03;

import java.util.Scanner;

// 한달이 며칠인지 알려주는 프로그램



public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = scan.nextInt();
		int day;
	
		switch(month) {
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		default :
			day = 0;
			System.out.println("존재하지 않는 달입니다.");
			
		}		
		
		System.out.println(month + "월은" + day + "일입니다.");
		
		scan.close();
		
	}

}
