package kr.co.ezenac.abstractclass;

public class DeskTop extends Computer {

	@Override
	void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff");
		super.turnOff();
	}
}
