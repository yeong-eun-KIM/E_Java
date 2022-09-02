package kr.co.ezenac.interfacee7;

public class MyBookshelfTest {

	public static void main(String[] args) {
		
		Que bQue = new MyBookshelf();
		bQue.enQueue("타이틀");
		bQue.enQueue("타이틀2");
		bQue.enQueue("타이틀3");
		
		System.out.println(bQue.deQueue());
		System.out.println(bQue.deQueue());
		System.out.println(bQue.deQueue());
		
	}

}
