package kr.co.ezenac.goingtoschooloop;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		//super();
		this.lineNumber = lineNumber;
	}
	
	public void ride(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선의 승객은 " + passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
	
	
}
