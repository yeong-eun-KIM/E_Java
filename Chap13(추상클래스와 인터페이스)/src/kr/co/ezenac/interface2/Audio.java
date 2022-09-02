package kr.co.ezenac.interface2;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨 0~10 사이에서만 프로그램이 작동
		
		if(volume>MAX_VOLUME) {
			System.out.println("Audio볼륨의 최대치 값은 10입니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (MIN_VOLUME> volume){
			System.out.println("Audio볼륨의 최소치 값은 0입니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
			
		}
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
}
