package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	private double salesRatio;

	public GoldCustomer(int i, String string) {
		super(i, string); //생략불가
		this.customerRank = "GOLD";
		this.bonusPointRatio = 0.02;
		salesRatio = 0.1;
		
		System.out.println("GoldCustomer(int,Stirng) 생성자 호출");
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price*bonusPointRatio;
		return (price - (int)(price*salesRatio));
	}
	
	
}
