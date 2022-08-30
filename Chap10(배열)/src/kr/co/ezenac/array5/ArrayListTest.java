package kr.co.ezenac.array5;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {

		ArrayList<Book> libray = new ArrayList<>();
		
		libray.add(new Book("제목", "작가"));
		libray.add(new Book("제목2", "작가2"));
		libray.add(new Book("제목3", "작가3"));
		libray.add(new Book("제목4", "작가4"));
		libray.add(new Book("제목5", "작가5"));
	
		for(int i=0; i <libray.size();i++) {
			libray.get(i).showInfo();
		}
	
	}
	
}
