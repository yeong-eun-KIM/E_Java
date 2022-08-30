package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArrayUtillMethod02 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4};
		double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3 = {"이순신", "신사임당", "단군", "김유신"};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		for(int n : arr1)
			System.out.print(n	+ "\t");
		System.out.println();
		
		for(double m : arr2)
			System.out.print(m	+ "\t");
		System.out.println();
		
		for(String k : arr3)
			System.out.println(k + "\t");
	}
}
