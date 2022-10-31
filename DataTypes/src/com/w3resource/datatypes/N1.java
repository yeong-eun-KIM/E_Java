package com.w3resource.datatypes;

import java.util.Scanner;
//화씨를 섭씨로 바꾸기
public class N1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double fa = scan.nextDouble();
		System.out.println(fa + " degree Fahrenheit is equal to "+ (fa-32)*5/9+ " in Celsius");
		
		scan.close();
	}
}
