package kr.co.ezenac.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
	} 
		public static void main(String[] args) {
			ThrowsException test = new ThrowsException();
			try {
				test.loadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}	
}
