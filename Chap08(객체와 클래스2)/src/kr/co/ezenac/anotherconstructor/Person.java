package kr.co.ezenac.anotherconstructor;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이순신", 35); //this()을 이용하여 아래 Person을 호출함
	}

	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}	
			
	public String getName() {
		return name;
	}

	public Person getPerson() {
		return this; //자기 자신을 가리킴 Person > Person
		
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person);
		System.out.println(person.getName());
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
	}
}
