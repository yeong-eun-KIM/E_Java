package kr.co.ezenac.lamda06;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> mySupplier = () -> "Hello World!";
		System.out.println(mySupplier.get());

		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		System.out.println();
		
		printRandomDloubles(random, 7);
		
	}

	public static void printRandomDloubles(Supplier<Double> supplier, int count) {
		for(int i = 0; i<count;i++) {
			System.out.println(supplier.get());
		}
	}
}
