package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InAndOut {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("InAndOut.txt");

		FileOutputStream fos = new FileOutputStream("COPY.txt");
		
		byte[] arr = fis.readAllBytes();
		fos.write(arr);
		
		System.out.println("파일을 복사했습니다.");
		
	}
}
