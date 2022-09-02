package kr.co.ezenac.variable03;


public class VarTest2 {

	public static void main(String[] args) {
		/*
		 * 문자값을 정수타입으로 바꾸게 되면,
		 * 아스키코드 값으로 바뀌어서 출력이 됨.
		 */
		char ch = 'a';
		int i = ch;
		System.out.println("문자 -> 정수 : " + i);
		
		//any 타입 + "" => 문자열 타입
		int i2 = 100;
		String str = "java" + i2;
		System.out.println(str);

	}

}
