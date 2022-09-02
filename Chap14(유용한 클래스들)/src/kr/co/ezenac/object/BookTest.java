package kr.co.ezenac.object;

class Book {

	private String title;
	private String author;
	
	public Book(String title, String author) {
		//super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title +", "+ author;
	}
	
	@Override
	public int hashCode() {

		return  100;
	}
	
}

public class BookTest{
	
	public static void main(String[] args) {
		Book book = new Book("제목", "저자");
		System.out.println(book.toString());
		
		}
	}