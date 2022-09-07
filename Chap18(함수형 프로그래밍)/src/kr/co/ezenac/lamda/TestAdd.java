package kr.co.ezenac.lamda;

public class TestAdd {

	public static void main(String[] args) {
		
		Add addF1 = (int x, int y) -> {return x+y;};
		Add addF2 = (int x, int y) -> x+y;
		Add addF3 = (x, y) -> x+y;
		
		System.out.println(addF1.add(3, 5));
	}

}
