package kr.co.ezenac.interfacee5;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("구매 주문");
	}
	
}
