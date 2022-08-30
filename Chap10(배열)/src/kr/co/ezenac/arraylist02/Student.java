package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	ArrayList<Book> booklist;
	
	public Student(String studentName) {
		//this.setStudentName(studentName);
		this.studentName = studentName;
		booklist = new ArrayList<>();
	}
	
	public void readbook (String name) {
		Book book = new Book(name);
		
		book.setTitle(name);
		booklist.add(book);
	}

	public void showInfo() {
		System.out.print(this.studentName +" 학생이 읽은 책은 : ");
		for(Book book : booklist) {
			System.out.print(book.getTitle()+" ");
		}
		System.out.println("입니다.");
				
	}	

}
