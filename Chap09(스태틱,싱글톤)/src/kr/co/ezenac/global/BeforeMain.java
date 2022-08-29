package kr.co.ezenac.global;

import java.util.Random;

public class BeforeMain {
	
	static int num;				//static 멤버 변수
	
	static {					//static 블록 (주로 초기화 용도로 쓰임)
		Random random = new Random();
		num = random.nextInt(100);			// main() 실행 전에 0~99 중 랜덤 추출
	
	}
	
	public static void main(String[] args) {
		System.out.println(num);
	}

}
