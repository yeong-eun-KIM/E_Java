package kr.co.ezenac.membership02;

public class VIPCustomer extends Customer {
	
	private int agentId;
	private double salesRatio;
	
//	public VIPCustomer() {
//		super(1000,"SIVER");
//		customerRank = "VIP";
//		bonusPointRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}

	public VIPCustomer(int custmoerId, String customerName) {
		super(custmoerId, customerName);
		
		customerRank = "VIP";
		bonusPointRatio = 0.05;
		salesRatio = 0.1;
		
		
		System.out.println("VIPCustomer(int,Stirng) 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price*bonusPointRatio;
		return price - (int)(salesRatio*price);
	}
	
}
