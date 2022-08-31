package kr.co.ezenac.membership02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerL = new Customer(20220831,"이순신");
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		VIPCustomer vipCustomerS = new VIPCustomer(20220901, "신사임당");
		vipCustomerS.bonusPoint = 10000;
		System.out.println(vipCustomerS.showInfo());
		
		System.out.println();
		
		
		Customer customerL2 = new VIPCustomer(20220902, "이방원"); //업캐스팅
		//customerL2는 Customer 클래스의 멤버변수와 메서드만 사용가능함
		customerL2.bonusPoint = 10000;
		System.out.println(customerL2.showInfo());
	}

}
