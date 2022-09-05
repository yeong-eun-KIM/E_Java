package kr.co.ezenac.list;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		
		System.out.println(myList);
		
		myList.remove();
		
		System.out.println(myList);
		
		
		
	}
}
