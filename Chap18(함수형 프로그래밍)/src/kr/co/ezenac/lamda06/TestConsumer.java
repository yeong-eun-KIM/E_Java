package kr.co.ezenac.lamda06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> consumer = (String str) -> System.out.println(str);
		consumer.accept("Good afternoon!");
		consumer.accept("Seoul Korea!");
		
		List<Integer> list = Arrays.asList(4,2,3);
		
		Consumer<Integer> consumer2 = x-> System.out.println("정수형 입력값 처리 : "+x);
		consumer2.accept(23);
		
		spend(list, consumer2);
		
		Consumer<Integer> consumer3 = x -> System.out.println("정수형 리스트 입력값 처리 : "+x);
		spend(list,consumer3);
		
		List<Double> dlist = Arrays.asList(1.1,2.2,3.3);
		Consumer<Double> dconsumer = db ->System.out.println("실수형 입력값 처리 : "+db);
		spend(dlist, dconsumer);
	}

	public static <T> void spend(List<T> inputs, Consumer<T> consumer) {
		for(T input : inputs) {
			consumer.accept(input);
			
		}
		
		
	}
}
