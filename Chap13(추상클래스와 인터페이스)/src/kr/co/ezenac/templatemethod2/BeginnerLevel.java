package kr.co.ezenac.templatemethod2;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("jump는 못합니다.");

	}

	@Override
	public void turn() {
		System.out.println("turn은 못합니다.");

	}

}
