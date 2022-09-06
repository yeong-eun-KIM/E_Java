package kr.co.ezenac.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		
		list.insertElement(3, "D");
		list.printAll();
		
		
		list.removeElement(2);
		list.printAll();
		System.out.println(list.getsize());
		list.printAll();
		list.removeAll();
		System.out.println(list.getsize());
		list.printAll();
	}

}
