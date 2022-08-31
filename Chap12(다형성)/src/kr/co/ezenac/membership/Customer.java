package kr.co.ezenac.membership;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerRank;
	int bonusPoint;
	double bonusPointRatio;
	
//	public Customer() {
//		this.customerRank = "SILVER";
//		this.bonusPointRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}
	
	
	public Customer(int i, String string) {
		//super();
		this.customerId = i;
		this.customerName = string;
		this.customerRank = "SILVER";
		this.bonusPointRatio = 0.01;
		
		System.out.println("Customer(int,String) 생성자 호출");
	}


	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerRank() {
		return customerRank;
	}



	public void setCustomerRank(String customerRank) {
		this.customerRank = customerRank;
	}



	public int getBonusPoint() {
		return bonusPoint;
	}



	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}



	public double getBonusPointRatio() {
		return bonusPointRatio;
	}



	public void setBonusPointRatio(double bonusPointRatio) {
		this.bonusPointRatio = bonusPointRatio;
	}



	public int calPrice(int price) {
		bonusPoint += price * bonusPointRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " + customerRank +"이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}
	
}
