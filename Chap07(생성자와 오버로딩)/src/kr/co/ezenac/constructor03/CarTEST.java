package kr.co.ezenac.constructor03;

public class CarTEST {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.toString());
		
		Car car2 = new Car("흰색", "오토", 5);
		System.out.println(car2);
		
	}

}
