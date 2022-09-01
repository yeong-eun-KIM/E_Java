package kr.co.ezenac.templatemethod;

public abstract class Car {
	
	final public void run() {				//템플릿메서드 - final을 붙여 오버라이드 안되게 함
		startCar();
		drive();
		stop();
		turnOff();
	}

	private void turnOff() {
		System.out.println("시동을 끕니다");
		
	}

	public abstract void stop();

	public abstract void drive();

	public void startCar() {
		System.out.println("시동을 켭니다.");
		
	}
}
