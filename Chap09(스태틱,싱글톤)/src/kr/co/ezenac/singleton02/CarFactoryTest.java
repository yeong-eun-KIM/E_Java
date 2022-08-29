package kr.co.ezenac.singleton02;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance(); //싱글톤
		
		Car bmwi14 = carFactory.createCar();
		Car bmwiX = carFactory.createCar();
		
		System.out.println(bmwi14.getCarNum());
		System.out.println(bmwiX.getCarNum());

	}

}
