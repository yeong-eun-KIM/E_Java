package kr.co.ezenac.stream;

import java.util.Arrays;

public class IntArrayTest {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sumResult = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		
		System.out.println(sumResult);
		System.out.println(count);
	}
}
