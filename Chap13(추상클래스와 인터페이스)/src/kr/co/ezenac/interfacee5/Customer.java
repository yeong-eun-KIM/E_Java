package kr.co.ezenac.interfacee5;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
		
	}

	public void sayworld() {
		System.out.println("Hello");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}
}
