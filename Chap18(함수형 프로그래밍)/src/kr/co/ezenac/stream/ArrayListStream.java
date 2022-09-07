package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("이순신 장군");
		sList.add("나대용 구선 제작자");
		sList.add("권율");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s +"\t"));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n+"\t"));
		System.out.println();
		
		sList.stream().filter(s -> s.length() >= 7).forEach(n -> System.out.print(n + "\t"));
		
	}
}
