package kr.co.ezenac.array2;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int[] score = null;					//score는 참조변수임 (메모리 할당 되어있지 않음)
		//score = {100,200}; 				배열이 생성되어 있지 않아 값 할당 불가
		
		score = new int[5];
		//배열명이 곧 주소임.
		System.out.println("score의 주소 값 : " + score);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score[" + i +"]=" + score[i]); // 값 확인
		}
		
		System.out.println();
		
		int[] arr1 = new int[10];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(int)(Math.random()*10+1);
		} // 1~10까지 난수 할당
		
		for(int i=0;i<arr1.length;i++) {
			if(i != 9) {
				System.out.println(arr1[i]+", ");
			}
			else 
				System.out.println(arr1[i]);
		}
	
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
		
	}
	

}
