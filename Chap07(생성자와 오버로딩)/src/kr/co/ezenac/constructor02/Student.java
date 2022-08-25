package kr.co.ezenac.constructor02;

public class Student {
	
	private String name;
	private int age;
	
	public Student () {
		System.out.println("기본생성자 호출");
	}
	
	
	// 매개변수가 있는 생성자 (overloading)
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		//super();
		this.name = name;
		this.age = age;
	}

	
	// 매개변수가 하나 뿐인 생성자 (overloading)
	public Student(String name) {
		System.out.println("매개변수가 String만 있는 생성자 호출");
		//super();
		this.name = name;
	}


	// 매개변수가 int 뿐인 생성자
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		//super();
		this.age = age;
	}	
		
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {

		return this.getName() + ", " + this.getAge();
	}
	
}
