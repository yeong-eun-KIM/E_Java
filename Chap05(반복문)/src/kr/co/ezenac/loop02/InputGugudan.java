package kr.co.ezenac.loop02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단을 출력합니다.");
		System.out.print("몇 단부터 출력할까요? : ");
		int i = scan.nextInt();
		System.out.print("끝 단은 얼마인가요? : ");
		int j = scan.nextInt();
				
		for ( ; i <= j; i++) {
			System.out.print("======" + i + " 단 " + "======\n");
			for (int k = 1;k<10; k++) {
				System.out.println(i+" * "+k+" = "+(i*k));
				
			} 
			scan.close();
		}

	}

}
