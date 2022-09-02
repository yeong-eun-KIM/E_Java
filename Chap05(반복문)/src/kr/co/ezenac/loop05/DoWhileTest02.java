package kr.co.ezenac.loop05;

import java.util.Scanner;

public class DoWhileTest02 {

	/*
	 * 메세지를 입력하세요.
	 * 프로그램을 종료하려면, q를 입력하세요.
	 * >(이젠)
	 * 입력받은 메시지 : 이젠
	 * >
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메세지를 입력하세요.");
		System.out.print("프로그램을 종료하려면, q를 입력하세요.");

		String str = null;
		
		do {
			System.out.print(">");
			str = scan.nextLine();
			System.out.print("입력받은 메세지 : " + str);
			
		} while (!str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
		scan.close();

	}

}
