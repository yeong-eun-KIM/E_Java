package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		Stream<String> strStream = Stream.of("곧 추석이","다가 옵니다.","연휴가 기다리고 있습니다.");
		List<String> str = strStream.collect(Collectors.toList());
		System.out.println(str);
		
		String[] cityArray = new String[] {"서울","뉴욕","밴쿠버"};
		Stream<String> cityStream = Arrays.stream(cityArray);
		List<String> cityList = cityStream.collect(Collectors.toList());
		System.out.println(cityList);
		
		
		
		
		
	}

}
