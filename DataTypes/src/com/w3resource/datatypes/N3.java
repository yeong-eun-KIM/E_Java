package com.w3resource.datatypes;

import java.util.Scanner;

public class N3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int integer = scan.nextInt();
		System.out.println("The sum of all digits in " + integer + " is " + ((integer/100)+(integer%100)/10+(integer%100)%10));
		
		scan.close();
	}
}
