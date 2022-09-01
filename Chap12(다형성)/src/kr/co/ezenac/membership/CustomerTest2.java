package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		//어떻게 다형성을 적용할것인가?
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202208, "이순신");
		Customer customerS = new Customer(202209, "신사임당");
		Customer customerL2 = new GoldCustomer(202210, "이성계"); //업캐스팅
		Customer customerC = new GoldCustomer(202211, "최영");
		Customer customerK = new VIPCustomer(202212, "김유신", 77777);
		//VIPCustomer downCastingcustomerK = (VIPCustomer)customerK; // 다운캐스팅
		
		
		customerL.bonusPoint = 10000;
		customerS.bonusPoint = 10000;
		customerL2.bonusPoint = 10000;
		customerC.bonusPoint = 10000;
		
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerL2);
		customerList.add(customerC);
		customerList.add(customerK);		

		System.out.println("=====고객정보출력=====");  //showInfo 오버라이딩
		
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println();
		System.out.println("=====현재 보너스 포인트 계산=====");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
		
		System.out.println();
		System.out.println("=====할인율계산====="); //calPrice 오버라이딩
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
		}
		
		
		System.out.println();
		System.out.println("=====누적 보너스 포인트 계산=====");
		for(Customer customer : customerList) {
			customer.bonusPoint += price*customer.bonusPointRatio; 
			System.out.println(customer.getCustomerName() + "님의 누적 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
		
		// 2차 구매
		System.out.println();
		System.out.println("=====할인율계산====="); //calPrice 오버라이딩
		int price2 = 5000;
		for(Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
		}
		
		//2차 누적 포인트 계산
		System.out.println();
		System.out.println("=====누적 보너스 포인트 계산=====");
		for(Customer customer : customerList) {
			customer.bonusPoint += price2*customer.bonusPointRatio; 
			System.out.println(customer.getCustomerName() + "님의 누적 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
		
		
	}

}
