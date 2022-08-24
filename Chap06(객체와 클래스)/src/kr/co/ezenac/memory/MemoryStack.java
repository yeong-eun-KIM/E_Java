package kr.co.ezenac.memory;

public class MemoryStack {

	public static int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		int result = add(number1, number2);
		System.out.println("result : ================" + result);
	}
	
}
