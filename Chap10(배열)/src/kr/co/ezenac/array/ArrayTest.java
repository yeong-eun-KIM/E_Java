package kr.co.ezenac.array;



public class ArrayTest {

	public static void main(String[] args) {
		
		class Box {

		}
		
		//길이가 5인 int형 1차원 배열 생성
		int[] arr1 = new int[5];
		
		
		//배열 생성과 동시에 초기화 (방법1)
		//개수는 생략해야함
		int [] arr2 = new int[] {1, 2, 3, 4, 5};		//뒤에 초기화하는 데이터 개수를 보고
													 	//생략된 숫자를 유추함
		//배열 생성과 동시에 초기화 (방법2)
		//new 자료형[] 생략 가능
		int [] arr3 = {1, 2, 3, 4, 5};					//뒤에 초기화하는 데이터를 보고
														//당연히 배열의 초기화 값이라고 유추함
		//배열 선언 후 배열을 생성하는 경우
		//new int[] 생략불가
		int []arr4;
		arr4 = new int[] {1, 2, 3, 4, 5};
		
		//길이가 7인 double형 1차원 배열 생성
		double[] arr5 = new double[7];
		
		//길이가 9인 float형 1차원 배열 생성
		float[] arr6;
		arr6 = new float[9];
		
		//객체 배열 1차원 배열
		Box[] arr7 = new Box[5];
		
		//배열의 객체 변수(length) 사용
		System.out.println("배열arr1 길이 : " + arr1.length);
		System.out.println("배열arr2 길이 : " + arr2.length);
		System.out.println("배열arr3 길이 : " + arr3.length);
		System.out.println("배열arr4 길이 : " + arr4.length);
		System.out.println("배열arr5 길이 : " + arr5.length);
		System.out.println("배열arr6 길이 : " + arr6.length);
		System.out.println("배열arr7 길이 : " + arr7.length);
	}
	
	
	

}


