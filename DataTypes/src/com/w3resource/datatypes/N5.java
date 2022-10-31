package com.w3resource.datatypes;

import java.util.Scanner;

public class N5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int gmt = scan.nextInt();
		System.out.println("Current time is " + (gmt/60) + " : " + (gmt%60)/60 + " : " + (System.currentTimeMillis()/1000)%60);
		
		scan.close();
		
	}
}
