package kr.co.ezenac.field02;

public class FieldInit /* extends Object */ {
	
	
	//기본형
	byte bytefield;					// 1byte
	short shortfield;				// 2
	int intfield;					// 4
	long longfield;					// 8
	 
	boolean booleanfield;			// 1
	
	char charfield;					// 2
	
	float floatfield;				// 4
	double dobulefield;				// 8
	
	//참조형
	int[] arrField;					// 4
	String strField;				// 4
	
	
	/*
	 * to string : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
	 * 				원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용함.
	 */
	@Override
	public String toString() {
		
		String str = "bytefield : " + bytefield +
					 ", shortfield : " + shortfield +
					 ", intfield : " + intfield +
					 ", longfield : " + longfield +
					 ", booleanfield : " + booleanfield +
					 ", charfield : " + charfield +
					 ", floatfield : " + floatfield +
					 ", dobulefield : " + dobulefield +
					 ", arrField : " + arrField +
					 ", strField : " + strField;
		
		return str;
	}
	
	
}
