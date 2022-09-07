package kr.co.ezenac.stream.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerL = new Customer("이순신", 40, 100);
		Customer customerN = new Customer("나대용", 20, 100);
		Customer customerK = new Customer("권율", 13, 50);
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customerL);
		customerList.add(customerN);
		customerList.add(customerK);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "만원 입니다.");
		
		System.out.println("==20세 이상 고객 명단 정렬하여 출력==");
		customerList.stream().filter(c->c.getAge()>=20).map(s->s.getName()).sorted().forEach(f -> System.out.println(f));
	}

	
}
