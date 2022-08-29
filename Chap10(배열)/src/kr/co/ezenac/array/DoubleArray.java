package kr.co.ezenac.array;

public class DoubleArray {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double total = 1;
		for(int i=0; i<dArr.length;i++) {
			total *= dArr[i];
		}
		
		System.out.println(total);
		
		System.out.println();
		
		//요소의 개수에 대한 변수
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
	
		total = 1;
		for(int i=0; i<count; i++) {
			total *= dArr[i];
		}
		System.out.println(total);
	}
}
