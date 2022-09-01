package kr.co.ezenac.templatemethod;

public class DLCAR extends Car {

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");

	}

	@Override
	public void drive() {
		System.out.println("자율주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");

	}

}
