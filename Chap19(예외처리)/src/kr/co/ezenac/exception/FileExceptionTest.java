package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("ezen.txt");

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");

		}
		System.out.println("여기도 정상 수행됩니다.");
	}
}
