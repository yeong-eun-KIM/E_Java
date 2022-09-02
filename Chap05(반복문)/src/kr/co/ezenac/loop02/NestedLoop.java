package kr.co.ezenac.loop02;

public class NestedLoop {

	public static void main(String[] args) {
		// 구구단을 찍는 프로그램을 작성하세요
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i +"*"+ j + "=" + (i*j));
			}
			System.out.println("========================");
		}

	}

}
