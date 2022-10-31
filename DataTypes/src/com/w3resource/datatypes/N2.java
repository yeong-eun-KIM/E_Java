package com.w3resource.datatypes;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double inch = scan.nextDouble();
		System.out.println(inch + " inch is " + (inch*0.0254) + " meters");
		
		scan.close();

	}

}
