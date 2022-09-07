package kr.co.ezenac.lamda06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class BiConsumer {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(2.2,3.3,4.4);
		java.util.function.BiConsumer<Integer, Double> biConsumer = (index,input) 
				-> System.out.println("두 개 입력값 처리 : "+input +"\n인덱스 번호 : " + index);
				
		spend(list,biConsumer);		
	}

	public static <T> void spend(List<T> inputs, java.util.function.BiConsumer<Integer, T> biconsumer) {
		for(int i =0;i<inputs.size();i++) {
			biconsumer.accept(i, inputs.get(i));
			
		}
		
	}
	
}
