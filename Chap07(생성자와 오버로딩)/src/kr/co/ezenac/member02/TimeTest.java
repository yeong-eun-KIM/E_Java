package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		//time.setHour(-20);
		time.setHour(10);
		time.setMinute(30);
		time.setSecond(50);
		
		System.out.println(time.toString());
	}
	

}
