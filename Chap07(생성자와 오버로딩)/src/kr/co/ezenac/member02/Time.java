package kr.co.ezenac.member02;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	//getter()
	public int getHour() {
		return this.hour;		
	}
	
	public void setHour(int hour) {
		//예외처리 코드 작성
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	
	@Override
	public String toString() {
		return this.getHour() + "시 ";
	}
}
