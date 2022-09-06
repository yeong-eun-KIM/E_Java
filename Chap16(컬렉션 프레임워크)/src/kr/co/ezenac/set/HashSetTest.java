package kr.co.ezenac.set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<>();
		hashset.add(new String("이순신"));
		hashset.add(new String("이도"));
		hashset.add(new String("신사임당"));
		hashset.add(new String("세종대왕"));
		hashset.add(new String("세종대왕"));

		System.out.println(hashset);
	
	}
	
}
