package kr.co.ezenac.loop05;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			showMenu();
			char myChar = scan.next().charAt(0);
			if(!checkNum(myChar)) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
				}
			
			int num = myChar - '0';
			/*
			 * 		  '1'	'0'
			 * 		   49    48
			 */
			System.out.println(num);
			if(num == 0) {
				break;
			}
			else {
				if (num > 4) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
				}
				
				System.out.print("첫 번째 숫자 : ");
				int num1 = scan.nextInt();
				System.out.print("두 번째 숫자 : ");
				int num2 = scan.nextInt();
				
				if (num == 1)
					addnum(num1,num2);
				else if (num ==2)
					minus(num1,num2);
				else if (num ==3)
					mutiply(num1,num2);
				else {
					divide(num1,num2);
					
					
					/*
					 * switch (num) { case 1: System.out.println(num1 + num2); case 2:
					 * System.out.println(num1 - num2); case 3: System.out.println(num1 * num2);
					 * case 4: System.out.println(num1 / num2);
					 * 
					 * }
					 */
				
				}
				
				
			}	
			
			System.out.println("계산기를 종료합니다.");
			
		}	
		
		scan.close();
		
	}
	
	public static void divide(int x, int y) {
		int result = x / y;
		System.out.println(x + "/" + y + "=" + result);
		
	}

	public static void mutiply(int x, int y) {
		int result = x * y;
		System.out.println(x + "*" + y + "=" + result);
		
	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println(x + "-" + y + "=" + result);
	}

	public static void addnum(int x, int y) {
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result);
		
	}

	public static boolean checkNum(char ch) {
		
		if(ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
		
	}

	//메뉴출력
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 끝내기");
		
				
	}

}
