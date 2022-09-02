package kr.co.ezenac.interfacee7;

public class MyBookshelf extends Bookshelf implements Que {

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
		
	}

	@Override
	public String deQueue() {
		
		return bookshelf.remove(0);
	}
	
	
	
}
