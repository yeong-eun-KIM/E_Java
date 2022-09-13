package kr.co.ezenac.stream02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fre = new FileReader("reader.txt");
		
		int i;
		while ((i = fre.read()) != -1)
			System.out.println((char)i);
			
			fre.close();
	}
}
