package kr.co.ezenac.decorator;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" + 모카시럽 추가");
	}
}
