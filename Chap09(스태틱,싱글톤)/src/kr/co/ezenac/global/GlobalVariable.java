package kr.co.ezenac.global;

class Cat {
	static int global = 5;		//static 변수 (initialize 되어있음)
	int num = 3;				//instance 변수
	
	public void printValue(int num) {
		this.num = num;
		System.out.println("num = " + this.num);
		System.out.println("global = " + Cat.global); //static은 클래스를 호출
	}
	
}

public class GlobalVariable {

		public static void main(String[] args) {		//프로그램 시작 지점
			int num1 = 5;								//지역변수
			int num2 = 2;
			System.out.println(num1 + "+"+ num2);
			
			Cat cat1 = new Cat();						//지역(참조)변수 --> 스택에 할당됨
			cat1.num = 1;
			Cat.global = 10;							//static 변수에 직접 접근(권장)
			cat1.printValue(20);  						//인스턴스 메서드 호출
			System.out.println(cat1.num);
			System.out.println(Cat.global);
			
			Cat cat2 = new Cat();
			cat2.num = 2;
			Cat.global = 11;
			cat2.printValue(10);
			System.out.println("cat2.num : " + cat2.num);
			System.out.println("cat2.global : " + Cat.global);
			
		}
}
