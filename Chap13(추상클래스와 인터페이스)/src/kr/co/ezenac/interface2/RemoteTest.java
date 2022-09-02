package kr.co.ezenac.interface2;

public class RemoteTest {

	public static void main(String[] args) {
		//인터페이스도 일종의 조상이므로 필드(변수)의 다형성 적용 가능
		
		RemoteControl remoteControlAudio = new Audio();
		remoteControlAudio.turnOn();
		remoteControlAudio.setVolume(15);
		remoteControlAudio.setVolume(-100);
		remoteControlAudio.turnOff();
		
		System.out.println();
		
		
		RemoteControl remoteControlTv = new Television();
		remoteControlTv.turnOn();
		remoteControlTv.setVolume(15);
		remoteControlTv.setVolume(-100);
		remoteControlTv.turnOff();
		
	}

}
