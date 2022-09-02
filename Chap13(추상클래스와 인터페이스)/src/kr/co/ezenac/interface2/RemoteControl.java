package kr.co.ezenac.interface2;

public interface RemoteControl {
	//생략
	//상수 (static final)
	//추상메서드 (abstract method)
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
