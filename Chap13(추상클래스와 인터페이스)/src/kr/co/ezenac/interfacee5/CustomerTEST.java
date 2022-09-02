package kr.co.ezenac.interfacee5;

public class CustomerTEST {

	public static void main(String[] args) {
		
		Customer customer = new Customer(); //1
		customer.buy();
		customer.sell();
		customer.sayworld();
		customer.order();
	
		
		Buy buyer = customer; // 1과 동일한 의미
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		buyer.order();
		seller.order();
	}
	
}
