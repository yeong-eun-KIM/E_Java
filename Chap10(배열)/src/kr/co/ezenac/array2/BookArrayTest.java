package kr.co.ezenac.array2;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
	
		book[0]= new Book("제목1", "이순신1");
		book[1]= new Book("제목2", "이순신2");
		book[2]= new Book("제목3", "이순신3");
		book[3]= new Book("제목4", "이순신4");
		book[4]= new Book("제목5", "이순신5");
		
		for(int i=0; i<book.length;i++) {
			System.out.println(book[i]); //주소값이 나옴
			book[i].showInfo();				//내용이 나옴
		}
		
		
	}

}
