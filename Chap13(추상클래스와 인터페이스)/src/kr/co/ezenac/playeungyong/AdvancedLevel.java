package kr.co.ezenac.playeungyong;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn합니다.");
		
	}

	@Override
	public void showMessage() {
		System.out.println("*****고급자레벨*****");
		
	}

}
