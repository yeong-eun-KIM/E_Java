package kr.co.ezenac.interface2;

public class CompleteCalculator extends Calculator {

	@Override
	public int times(int num1, int num2) {
		
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR;
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("모두 구현한 상태입니다");
	}
	
}
