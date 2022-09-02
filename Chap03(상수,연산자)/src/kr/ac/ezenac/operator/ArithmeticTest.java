package kr.ac.ezenac.operator;

public class ArithmeticTest {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		int result;
		
		//예외 처리 코드
		try {
			result = 10 / 0;				//산술연산 예외 발생하는 부분
		} catch(ArithmeticException e) {
		System.out.println("예외 발생 : " + e);
		}
		
	}
	
}
