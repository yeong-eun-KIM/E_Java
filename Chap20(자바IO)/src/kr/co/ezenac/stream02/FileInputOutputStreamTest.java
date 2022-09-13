package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("output2.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("output3.txt");
		
		byte[] readBytes = new byte[100];
		int data = 0;
		while((data = fileInputStream.read(readBytes))!= -1) {
			fileOutputStream.write(readBytes);
			System.out.println("읽은바이트 수 : "+ data);
			
		}
		fileOutputStream.flush();
		System.out.println("복사본 파일이 생성 되었습니다.");
		
		fileOutputStream.close();
		fileInputStream.close();
	}
}
