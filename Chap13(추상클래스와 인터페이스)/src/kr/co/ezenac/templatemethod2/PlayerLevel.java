package kr.co.ezenac.templatemethod2;

public abstract class PlayerLevel {
	final public void go(){
		run();
		jump();
		turn();
	};
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
}
