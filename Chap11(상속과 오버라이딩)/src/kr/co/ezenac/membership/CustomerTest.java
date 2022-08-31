package kr.co.ezenac.membership;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerL = new Customer(20220831,"이순신");
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		VIPCustomer vipCustomerS = new VIPCustomer();
		vipCustomerS.setCustomerName("신사임당");
		vipCustomerS.setCustomerId(20220901);
		vipCustomerS.bonusPoint = 10000;
		System.out.println(vipCustomerS.showInfo());
		
		
	}

}
