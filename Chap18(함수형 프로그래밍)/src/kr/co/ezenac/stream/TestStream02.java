package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.co.ezenac.stream.model.User;

public class TestStream02 {
	
	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3,-5,7,-9,11);
		Stream<Integer> filteredNumberStream = numberStream.filter(x-> x>0);
		List<Integer> filteredNumber = filteredNumberStream.collect(Collectors.toList());
		System.out.println(filteredNumber);
		
		System.out.println();
		
		//위를 한줄로 표현
		List<Integer> numberStream2 = Stream.of(3,-5,7,-9,11)
				.filter(x->x>0).collect(Collectors.toList());
		System.out.println(numberStream2);
		
		User user1 = new User().setId(101).setName("Mike").setVerified(true).setEmailAddress("mike@gmail.com");
		User user2 = new User().setId(102).setName("Juliana").setVerified(false).setEmailAddress("juliana@gmail.com");
		User user3 = new User().setId(103).setName("Tom").setVerified(true).setEmailAddress("tom@gmail.com");
		
		List<User> users = Arrays.asList(user1,user2,user3);
		List<User> verifiedUsers = users.stream().filter(user -> user.isVerified()).collect(Collectors.toList());
		System.out.println(verifiedUsers);
		List<User> unverifiedUsers = users.stream().filter(user -> !user.isVerified()).collect(Collectors.toList());
		System.out.println(unverifiedUsers);
	}
}
