package kr.co.ezenac.templatemethod2;

public class IntermeditateLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.".repeat(2));

	}

	@Override
	public void turn() {
		System.out.println("turn은 못합니다.");

	}

}
