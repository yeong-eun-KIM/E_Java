package kr.co.ezenac.set02;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("이순신");
		treeSet.add("류성룡");
		treeSet.add("신사임당");
		treeSet.add("신사임당");
		
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
	
}
