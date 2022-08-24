package kr.co.ezenac.field02;

public class FieldInitTest {

	public static void main(String[] args) {
		
		/*
		 * new 연산자
		 * - 클래스에 있는 멤버들의 바이트 크기만큼
		 *	 heap에다가 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 함.
		 */
		FieldInit fieldInit = new FieldInit();
		
		System.out.println(fieldInit.bytefield);
		System.out.println(fieldInit.shortfield);
		System.out.println(fieldInit.intfield);
		System.out.println(fieldInit.longfield);
		
		System.out.println(fieldInit);

	}

}
