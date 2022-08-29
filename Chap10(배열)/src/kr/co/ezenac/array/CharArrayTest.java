package kr.co.ezenac.array;

// 문자배열 A~Z까지 배열에 저장하고 이를 출력하시오

public class CharArrayTest {

	public static void main(String[] args) {
		
	char[] arr2 = new char[26];
	
	for(char c ='A',i=0; i <arr2.length; i++,c++) {
		arr2[i] = c;
		System.out.println(arr2[i]);
		//System.out.println(c); //배열이 아니라 문자를 출력한 것
	}
	
	
	
	//향상된 for문
	for(int alpha : arr2) {
		System.out.println(alpha);
	}
	
	
	}

}
