package kr.co.ezenac.membership;

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

	public VIPCustomer(int custmoerId, String customerName,int agentId) {
		super(custmoerId, customerName);
		
		customerRank = "VIP";
		bonusPointRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
		
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
	@Override
	public String showInfo() {
		return super.showInfo() + "담당 상담원의 번호는 " + agentId + "입니다.";
	}
	
}
