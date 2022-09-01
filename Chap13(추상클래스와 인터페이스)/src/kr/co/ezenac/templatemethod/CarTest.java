package kr.co.ezenac.templatemethod;

public class CarTest {

	public static void main(String[] args) {
		Car dlcar = new DLCAR();
		dlcar.run();
		System.out.println();
		
		
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
