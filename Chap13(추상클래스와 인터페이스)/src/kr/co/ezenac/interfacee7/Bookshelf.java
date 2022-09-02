package kr.co.ezenac.interfacee7;
//책꽂이

import java.util.ArrayList;

public class Bookshelf {
	
	protected ArrayList<String> bookshelf;
	
	public Bookshelf() {
		bookshelf = new ArrayList<>();
	}
	
	public ArrayList<String> getBookshelf(){
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}
	
}
