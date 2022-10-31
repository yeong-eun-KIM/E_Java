package com.w3resource.datatypes;

import java.util.Scanner;

public class N4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int minutes = scan.nextInt();
		System.out.println(minutes + " minutes is approximately " + (minutes/(365*60*24)) + "years and " + (minutes%(365*60*24)/(60*24)) + " days" );
		
		scan.close();
	}
}
