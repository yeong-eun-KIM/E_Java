package kr.co.ezenac.stream02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
	}	catch (FileNotFoundException e) {
		e.printStackTrace();
		}	catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				
				try{fis.close();}
				catch (IOException e) {
					e.printStackTrace();
				}
			} 
		}
		System.out.println();
	}
}
