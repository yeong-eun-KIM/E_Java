package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {
	
	public static void main(String[] args) {
		System.out.println("여러 개 입력 후 '끝' 이라고 입력하세요.");
		
		int i;
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i= isr.read()) != '끝') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
