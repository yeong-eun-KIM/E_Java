package kr.co.ezenac.stream02;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i<bs.length; i++)
				bs[i] = data++;
			
			fos.write(bs);
			
		}	catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("출력 완료");
	}

}
