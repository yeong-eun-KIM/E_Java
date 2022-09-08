package kr.co.ezenac.stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
