package kr.co.ezenac.lamda03;

import java.util.function.Function;

public class TestAdder {

	public static void main(String[] args) {
		Function<Integer,Integer> myAdder = new Adder();
		int result = myAdder.apply(5);
		System.out.println(result);
	}
}
