package kr.co.ezenac.templatemethod3;

public class IntermediateLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.\n".repeat(2));
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 할 수 없습니다.");
		
	}

	@Override
	public void showMessage() {
		System.out.println("*****중급자레벨*****");
		
	}

}
