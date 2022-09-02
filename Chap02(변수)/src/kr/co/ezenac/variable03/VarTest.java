package kr.co.ezenac.variable03;

/*
 * 1. 자료형 변환이 필요한 이유
 *  - 피연산자의 자료형이 일치해야 동일한 방법을 적용하여 연산을 진행할 수 있음.
 *  - 피연산자의 자료형이 일치하지 않을 때 형(Type)의 변환을 통해 일치를 시켜야 함.
 *  
 *  2. 종류
 *  - 자동 형변환 (Implicit Conversion)
 *  	- 규칙1) 자료형의 크기가 큰 방향으로 형 변환이 일어남.
 *  	- 규칙2) 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선함.
 *  
 */

public class VarTest {

	public static void main(String[] args) {
		byte b1 = 127;
		//byte b2 = b1 +2;				//오버플로우 (129)
		byte b2 = (byte)(b1 + 2); 		//강제캐스팅(강제형변환)
		System.out.println(b1);
		System.out.println("강제캐스팅 후 : " + b2);
		
		int i1 = b1;					//자동캐스팅 (형변환 코드 생략가능)
		System.out.println("자동캐스팅 후 : " + i1);

		/*
		 * 정수와 실수간의 캐스팅
		 * => 저장하는 방식이 틀리기 때문에 반드시 데이터 손실이 있고
		 * 	  아울러 명시적 캐스팅 코드 들어가야함.
		 */
		 int i3 = 100;
		 float f1 = i3;		//캐스팅 생략가능
		 System.out.println("정수 -> 실수 : " + f1);
		 
		 float f2 = 10.55f;
		 int i4 = (int)f2;
		 System.out.println("실수 -> 정수 : " + i4);
		 
		 double num1 = 30;
		 System.out.println(59L + 34.5);
		 
	}

}
