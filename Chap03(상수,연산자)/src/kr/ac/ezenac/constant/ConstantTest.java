package kr.ac.ezenac.constant;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100; //선언과 동시에 초기화
		final int MIN_NUM;		//선언하고
		MIN_NUM = 60;			//나중에 초기화. 딱 한번 가능
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 10; 
		
		int myScore = 50;
		
		// 상수를 사용하면 가독성이 좋아짐
		if (myScore < MIN_NUM) {
			System.out.println("당신의 학점 등급은 F입니다.");
		}
	}

}
