package kr.co.ezenac.stream02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);
			
			fw.write("안녕하세요. 좋은 아침입니다."); //String 출력
			fw.write(buf, 1, 2); //문자배열의 일부출력
			fw.write("65");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
