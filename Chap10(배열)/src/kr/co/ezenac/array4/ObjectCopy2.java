package kr.co.ezenac.array4;

import kr.co.ezenac.array2.Book;

public class ObjectCopy2 {
	
	public static void main(String[] args) {
	
		Book[] libray = new Book[5];
		Book[] copyLibray = new Book[5];
		
		libray[0]= new Book("제목1", "이순신1");
		libray[1]= new Book("제목2", "이순신2");
		libray[2]= new Book("제목3", "이순신3");
		libray[3]= new Book("제목4", "이순신4");
		libray[4]= new Book("제목5", "이순신5");
		
		copyLibray[0] = new Book();
		copyLibray[1] = new Book();
		copyLibray[2] = new Book();
		copyLibray[3] = new Book();
		copyLibray[4] = new Book();
		
		
		for(int i=0;i<libray.length;i++) {
			copyLibray[i].setTitle(libray[i].getTitle());
			copyLibray[i].setAuthor(libray[i].getAuthor());
		}
		
		libray[0].setTitle("구글 엔지니어");
		libray[0].setAuthor("윈터스");
		
		System.out.println();
		
		for(Book book : libray)
			book.showInfo();
		
		System.out.println();
		
		for(Book book : copyLibray)
			book.showInfo();
		
		
	}
}
