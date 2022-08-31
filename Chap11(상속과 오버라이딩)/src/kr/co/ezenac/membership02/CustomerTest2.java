package kr.co.ezenac.membership02;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		Customer customer = new Customer(2022, "이순신");
		customer.bonusPoint = 1000;
		int priceL = customer.calPrice(10000);
		System.out.println(customer.showInfo() + "지불금액은 "+ priceL + "입니다.");
		
		System.out.println();
		
		Customer customer2 = new VIPCustomer(2023, "신사임당");
		customer2.bonusPoint = 10000;
		int priceV = customer2.calPrice(10000);
		System.out.println(customer2.showInfo() + "지불금액은 " + priceV + "입니다." );
		
		
	}

}
