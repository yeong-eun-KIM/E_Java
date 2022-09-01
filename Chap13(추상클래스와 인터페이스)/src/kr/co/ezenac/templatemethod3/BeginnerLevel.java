package kr.co.ezenac.templatemethod3;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump는 할 수 없습니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 할 수 없습니다.");
		
	}

	@Override
	public void showMessage() {
		System.out.println("*****초급자레벨*****");
		
	}

}
